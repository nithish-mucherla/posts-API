package com.classpath.helloworld.model;

import javax.persistence.*;

@Entity
@Table(name="")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commentId;

    private String comment;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
}
