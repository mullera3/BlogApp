package com.example.blogapp.service.impl;

import com.example.blogapp.dto.UserDto;
import com.example.blogapp.model.User;
import com.example.blogapp.repository.UserRepository;
import com.example.blogapp.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(UserDto user) {
        User newUser = dtoToUser(user);
       return userRepository.save(newUser);
    }

    @Override
    public User fetchUser(UserDto user) {
        List<User> users = getAllUser();

        for (User temp : users) {
            if ((Objects.equals(user.getEmail(), temp.getEmail())) && (Objects.equals(user.getPassword(), temp.getPassword())))
                return dtoToUser(user);
        }

        return new User();
    }

    @Override
    public User updateUser(User user, Integer id) {
        Optional<User> savedUser = userRepository.findById(id);
        savedUser = Optional.ofNullable(user);
        assert user != null;
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer Id) {
        userRepository.deleteById(Id);

    }

    public User dtoToUser(UserDto userDto) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new User(userDto.getFirstName(), userDto.getLastName(), userDto.getDob(), userDto.getEmail(), userDto.getPassword(),ts,ts);
    }

    public UserDto userToDto(User user) {
        return new UserDto(user.getId(),user.getFirstName(),
                user.getLastName(),user.getDob(),user.getEmail(), user.getPassword());
    }

    public UserDto jsonToDto(String json) throws JsonProcessingException, ParseException {
        JsonNode jsonNode = new ObjectMapper().readValue(json, JsonNode.class);
        String firstName = jsonNode.get("firstName").asText();
        String lastName = jsonNode.get("lastName").asText();
        Date dob = new SimpleDateFormat("MM/dd/yyyy")
                .parse(jsonNode.get("dob").asText());

        String email = jsonNode.get("email").asText();
        String password = jsonNode.get("password").asText();
        UserDto newUser = new UserDto();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setDob(dob);
        newUser.setEmail(email);
        newUser.setPassword(password);

        return newUser;
    }
    @Override
    public User fetchUser(String email, String password){
        List<User> users = getAllUser();

        for (User temp : users) {
            if ((Objects.equals(email, temp.getEmail())) && (Objects.equals(password, temp.getPassword())))
                return temp;
        }

        return new User();

    }

    public List<User> getAllUser(){
       return userRepository.findAll();

    }

}
