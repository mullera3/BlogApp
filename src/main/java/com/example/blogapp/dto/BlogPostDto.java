package com.example.blogapp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class BlogPostDto extends BaseWebPostDto{

    public BlogPostDto(int id, int likes, int dislikes, String body, Date created_date) {
        super(id, likes, dislikes, body, created_date);
    }

    public BlogPostDto() {
    }

    @Override
    public String toString() {
        return "BlogPostDto{} " + super.toString();
    }
}
