package com.example.blogapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public abstract class BaseWebPost {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "total_likes")
    private  int likes;

    @Column(name = "total_dislikes")
    private  int dislikes;

    @Column(name = "post_body")
    private  String body;

    @Column(name = "date_created")
    private Date created_date;

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public BaseWebPost(int id, int userId, int likes, int dislikes, String body, Date created_date, String title) {
        this.id = id;
        this.userId = userId;
        this.likes = likes;
        this.dislikes = dislikes;
        this.body = body;
        this.created_date = created_date;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private  String title;

    public BaseWebPost(int id, int likes, int dislikes, String body, String title) {
        this.id = id;
        this.likes = likes;
        this.dislikes = dislikes;
        this.body = body;
        this.title = title;
    }

    public BaseWebPost()
    {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BaseWebPost{" +
                "id=" + id +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
