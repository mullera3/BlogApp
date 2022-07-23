package com.example.blogapp.model;


import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "comment_posts")
public class CommentPost extends BaseWebPost {


    public CommentPost(int id, int userId, int likes, int dislikes, String body, Date created_date, String title) {
        super(id, userId, likes, dislikes, body, created_date, title);
    }

    public CommentPost() {
    }

    @Override
    public String toString() {
        return "CommentPost{} " + super.toString();
    }
}
