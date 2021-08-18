package com.classpath.helloworld.service;

import com.classpath.helloworld.model.Post;
import com.classpath.helloworld.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PostService {

    PostRepository postRepository;

    PostService(PostRepository postRepository) {
        //dependency Injection
        this.postRepository = postRepository;
    }
    public Set<Post> fetchPosts() {
       return this.postRepository.findAll();
    }

    public Post save(Post post) {
        return this.postRepository.save(post);
    }

    public Post fetchPostWithId(long postId) {
        return this.postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Post id"));
    }

    public void deletePostWithId(long postId) {
        this.postRepository.deleteById(postId);
    }
}
