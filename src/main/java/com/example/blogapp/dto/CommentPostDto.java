package com.example.blogapp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommentPostDto extends BaseWebPostDto {

    public CommentPostDto() {
    }

    public CommentPostDto(int id, int likes, int dislikes, String body, Date created_date) {
        super(id, likes, dislikes, body, created_date);
    }

    @Override
    public String toString() {
        return "CommentPostDto{} " + super.toString();
    }
}
