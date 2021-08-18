package com.classpath.helloworld.controller;

import com.classpath.helloworld.model.Post;
import com.classpath.helloworld.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private PostService postService;
    public PostController(PostService postService) {
        //Dependency Injection
        this.postService = postService;
    }

    @GetMapping
    public Set<Post> fetchAllPosts() {
        return this.postService.fetchPosts();
    }

    @GetMapping("/{id}")
    Post fetchPostWithId(@PathVariable("id") long postId) {
        return this.postService.fetchPostWithId(postId);
    }

    @PostMapping
    public Post Save(@RequestBody Post post) {
        return this.postService.save(post);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long postId) {
        this.postService.deletePostWithId(postId);
    }
}
