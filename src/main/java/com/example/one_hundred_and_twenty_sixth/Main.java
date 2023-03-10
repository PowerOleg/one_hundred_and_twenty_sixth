package com.example.one_hundred_and_twenty_sixth;

import com.example.one_hundred_and_twenty_sixth.models.Auto;
import com.example.one_hundred_and_twenty_sixth.models.User;
import com.example.one_hundred_and_twenty_sixth.services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = userService.findUser(4);
        Auto auto = userService.findAutoById(8);
        System.out.println(user);
        System.out.println(auto);

//        UserService userService = new UserService();
//        User user = new User("Bob", 15);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Renault", "Maron");
//        ferrari.setUser(user);
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Lada", "Silver");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);


//        UserService userService = new UserService();
//        User user = new User("Masha",26);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);



//        UserService userService = new UserService();
//        User user = new User("Masha",26);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);
//        userService.deleteUser(user);
    }
}