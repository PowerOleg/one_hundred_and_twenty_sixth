
package com.example.one_hundred_and_twenty_sixth.services;


import com.example.one_hundred_and_twenty_sixth.dao.UserDao;
import com.example.one_hundred_and_twenty_sixth.dao.UserDaoImpl;
import com.example.one_hundred_and_twenty_sixth.models.Auto;
import com.example.one_hundred_and_twenty_sixth.models.User;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDaoImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}