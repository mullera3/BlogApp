package com.example.blogapp.service;

import com.example.blogapp.dto.UserDto;
import com.example.blogapp.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.text.ParseException;
import java.util.List;


public interface UserService {

    // Save operation
    User saveUser(UserDto user);

    // Read operation
    User fetchUser(UserDto user);

    // Update operation
    User updateUser(User user ,Integer id);

    // Delete operation
    void deleteUserById(Integer Id);

    User dtoToUser(UserDto userDto);

    UserDto userToDto(User user);

    UserDto jsonToDto(String json) throws JsonProcessingException, ParseException;

    User fetchUser(String email, String password);

    List<User> getAllUser();


}
