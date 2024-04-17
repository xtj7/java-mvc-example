package com.example.springboot.repository;

import com.example.springboot.model.User;

import java.util.List;

public interface UserRepository {
    int save(User user);

    int update(User user);

    User findById(Long id);

    int deleteById(Long id);

    List<User> findAll();

    User findByUsername(String username);

    int deleteAll();
}
