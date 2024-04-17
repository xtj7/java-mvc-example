package com.example.springboot.model;

public class UpdateProfile {
    private long id;
    private String username;
    private String password;
    private String description;

    public UpdateProfile() {}
    public UpdateProfile(int id, String username, String password, String description) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
