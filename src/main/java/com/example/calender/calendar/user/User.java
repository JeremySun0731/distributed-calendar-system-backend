package com.example.calender.calendar.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    //initialize the username String
    private String userName;
    //initialize the email with String
    private String email;
    //initialize the password with String
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
