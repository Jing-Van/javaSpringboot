package com.omega.mtest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
	
	
    UserMockedData userMockedData = UserMockedData.getInstance();

    @GetMapping("/user")
    public List<User> index(){
        return userMockedData.fetchusers();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return userMockedData.getUserById(userId);
    }
   
}
