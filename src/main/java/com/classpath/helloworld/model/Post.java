package com.classpath.helloworld.model;

import java.time.LocalDate;
import java.util.Objects;

public class Post {
    private long postId;
    private String title, description, author, imageUrl;
    private LocalDate timestamp;

    public Post(long postId, String title, String description, String author, String imageUrl, LocalDate timestamp) {
        this.postId = postId;
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUrl = imageUrl;
        this.timestamp = timestamp;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId && title.equals(post.title) && description.equals(post.description) && author.equals(post.author) && imageUrl.equals(post.imageUrl) && timestamp.equals(post.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, title, description, author, imageUrl, timestamp);
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
