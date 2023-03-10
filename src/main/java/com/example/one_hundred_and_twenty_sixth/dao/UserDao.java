package com.example.one_hundred_and_twenty_sixth.dao;

import com.example.one_hundred_and_twenty_sixth.models.Auto;
import com.example.one_hundred_and_twenty_sixth.models.User;

import java.util.List;

public interface UserDao {
    User findById(int id);

    void save(User user);

    void update(User user);

    void delete(User user);
   List<User> findAll();
    Auto findAutoById(int id);
}
