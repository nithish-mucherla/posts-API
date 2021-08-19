package com.classpath.helloworld.util;

import com.classpath.helloworld.model.Comment;
import com.classpath.helloworld.model.Post;
import com.classpath.helloworld.repository.PostRepository;
import javafx.application.Application;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class BootstrapPostData implements ApplicationListener<ApplicationReadyEvent> {
    //ApplicationListener<ApplicationReadyEvent> will aid the compiler to execute the event handler only after the application is ready

    private PostRepository postRepository;

    BootstrapPostData(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Post post1 = new Post();
        post1.setAuthor("Admin");
        post1.setDescription("Des-1");
        post1.setTimestamp(LocalDate.now());
        post1.setTitle("Post-1");
        post1.setImageUrl("imageUrl");

        Comment comment1 = new Comment();
        comment1.setComment("Good post");
        Comment comment2 = new Comment();
        comment2.setComment("Please continue the work");
        Comment comment3 = new Comment();
        comment3.setComment("Congratulations!");

        post1.addComment(comment1);
        post1.addComment(comment2);
        post1.addComment(comment3);

        this.postRepository.save(post1);

    }
}
