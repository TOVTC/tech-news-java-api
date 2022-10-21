package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentText;
    private Integer userId;
    private String username;
    private Integer postId;

    public Comment() {

    }

    public Comment(Integer id, String commentText, Integer userId, String username, Integer postId) {
        this.id = id;
        this.commentText = commentText;
        this.userId = userId;
        this.username = username;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id) && Objects.equals(commentText, comment.commentText) && Objects.equals(userId, comment.userId) && Objects.equals(username, comment.username) && Objects.equals(postId, comment.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentText, userId, postId);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentText='" + commentText + '\'' +
                ", userId=" + userId +
                ", username= " + username +
                ", postId=" + postId +
                '}';
    }
}
