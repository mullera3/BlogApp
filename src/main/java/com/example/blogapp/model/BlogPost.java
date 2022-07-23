package com.example.blogapp.model;


import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "blog_posts")
public class BlogPost extends BaseWebPost {

    public BlogPost(){

    }

    public BlogPost(int id, int userId, int likes, int dislikes, String body, Date created_date, String title) {
        super(id, userId, likes, dislikes, body, created_date, title);
    }

    @Override
    public String toString() {
        return "BlogPost{} " + super.toString();
    }
}
