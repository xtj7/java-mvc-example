package com.example.springboot.model;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String username;
    private String password;
    private String description;
    private String avatar;
    private LocalDateTime registeredAt;

    public User() {}

    public User(long id, String username, String password, String description, String avatar, LocalDateTime registeredAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.description = description;
        this.avatar = avatar;
        this.registeredAt = registeredAt;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
    public LocalDateTime getRegisteredAt() {
        return this.registeredAt;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return this.avatar;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", desc=" + description + ", registeredAt=" + registeredAt + "]";
    }
}
