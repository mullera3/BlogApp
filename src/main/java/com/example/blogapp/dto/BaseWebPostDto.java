package com.example.blogapp.dto;


import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.Objects;

@MappedSuperclass
public class BaseWebPostDto {
    private int id;
    private  int likes;
    private  int dislikes;
    private  String body;
    private Date created_date;

    public BaseWebPostDto(int id, int likes, int dislikes, String body, Date created_date) {
        this.id = id;
        this.likes = likes;
        this.dislikes = dislikes;
        this.body = body;
        this.created_date = created_date;
    }

    public BaseWebPostDto() {
    }

    public int getId() {
        return id;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String getBody() {
        return body;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseWebPostDto that = (BaseWebPostDto) o;
        return id == that.id && likes == that.likes && dislikes == that.dislikes &&
                Objects.equals(body, that.body) && Objects.equals(created_date, that.created_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, likes, dislikes, body, created_date);
    }
}
