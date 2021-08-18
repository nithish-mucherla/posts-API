package com.classpath.helloworld.service;

import com.classpath.helloworld.model.Post;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PostService {

    private static Set<Post> posts = new HashSet<Post>();
    public Set<Post> fetchPosts() {
       return posts;
    }

    public Post save(Post post) {
            posts.add(post);
            return post;
    }

    public Post fetchPostWithId(long postId) {
        return posts.stream()
                .filter(post -> post.getPostId()==postId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Post id"));
    }

    public void deletePostWithId(long postId) {
        posts.removeIf(post -> post.getPostId() == postId);
    }
}
