package com.omega.mtest;

import java.util.ArrayList;
import java.util.List;

public class UserMockedData {
    //list of User posts
    private List<User> users;

    private static UserMockedData instance = null;
    
    // Make this singleton
    // for a more extended REST service
    // update, delete, create, etc
    public static UserMockedData getInstance(){
         if(instance == null){
             instance = new UserMockedData();
         }
         return instance;
    }

    public UserMockedData(){
        users = new ArrayList<User>();
        users.add(new User(1, "John", 31, "New York"));
        users.add(new User(2, "Doe", 22, "Vancouver" ));
    }

    // return all users
    public List<User> fetchusers() {
        return users;
    }

    // return User by id
    public User getUserById(int id) {
        for(User b: users) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }


}
