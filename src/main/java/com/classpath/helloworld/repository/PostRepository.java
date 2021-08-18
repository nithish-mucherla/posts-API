package com.classpath.helloworld.repository;

import com.classpath.helloworld.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PostRepository extends CrudRepository<Post, Long> {
    Set<Post> findAll();
}
