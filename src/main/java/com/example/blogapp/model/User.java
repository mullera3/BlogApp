package com.example.blogapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String password;
    private Timestamp dateUserCreated;
    private Timestamp dateUserUpdated;

    public User(String firstName, String lastName, Date dob, String email, String password, Timestamp dateUserCreated, Timestamp dateUserUpdated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.dateUserCreated = dateUserCreated;
        this.dateUserUpdated = dateUserUpdated;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateUserCreated() {
        return dateUserCreated;
    }

    public void setDateUserCreated(Timestamp dateUserCreated) {
        this.dateUserCreated = dateUserCreated;
    }

    public Timestamp getDateUserUpdated() {
        return dateUserUpdated;
    }

    public void setDateUserUpdated(Timestamp dateUserUpdated) {
        this.dateUserUpdated = dateUserUpdated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
