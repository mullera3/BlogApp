package com.example.blogapp.controller;

import com.example.blogapp.dto.UserDto;
import com.example.blogapp.model.User;
import com.example.blogapp.service.impl.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;

@RestController
@RequestMapping("/demo")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping(path="/add")
    public User addNewUser ( @RequestBody String response) throws JsonProcessingException, ParseException {
        UserDto userDto = userService.jsonToDto(response);
        return userService.saveUser(userDto);
    }

    @GetMapping("/login")
    public User getUser(@RequestParam(name = "email") String email,@RequestParam("password") String password){
        return userService.fetchUser(email,password);
    }

}
