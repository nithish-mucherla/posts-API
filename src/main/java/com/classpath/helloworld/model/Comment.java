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

    public Comment() {
    }

    public Comment(long commentId, String comment, Post post) {
        this.commentId = commentId;
        this.comment = comment;
        this.post = post;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
