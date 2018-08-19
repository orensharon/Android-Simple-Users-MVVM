package com.soren.androidmvvm;

import com.soren.androidmvvm.model.User;

import java.util.ArrayList;

public class Demo {

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Sharon", false,  "https://images.pexels.com/photos/46710/pexels-photo-46710.jpeg?auto=compress&cs=tinysrgb&h=350"));
        users.add(new User(2, "David", true, "https://images.pexels.com/photos/33044/sunflower-sun-summer-yellow.jpg?auto=compress&cs=tinysrgb&h=350"));
        users.add(new User(3, "John", false, "https://images.pexels.com/photos/219998/pexels-photo-219998.jpeg?auto=compress&cs=tinysrgb&h=350"));
        users.add(new User(4, "Max", true, "https://www.denverpost.com/wp-content/uploads/2018/01/day_in_pictures_010818_001.jpg?w=620"));
        return users;
    }

}
