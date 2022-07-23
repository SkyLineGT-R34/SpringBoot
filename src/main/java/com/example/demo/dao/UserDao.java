package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    User read(long id);
    void update(long id, User user);
    void delete(long id);
    List<User> readAll();
}
