package com.airtribe.NewsAggregatorAPI.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "users")
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String userName;
    private  String password;
    private  String email;
    @Autowired
    private NewsPreference newsPreference;

    public User() {
    }

    public User(Long id, String userName, String password, String email, @Qualifier("COUNTRY") NewsPreference newsPreference) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.newsPreference = newsPreference;
    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public NewsPreference getNewsPreference() {
        return newsPreference;
    }

    public void setNewsPreference(NewsPreference newsPreference) {
        this.newsPreference = newsPreference;
    }
}
