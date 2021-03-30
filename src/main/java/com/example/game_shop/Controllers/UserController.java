package com.example.game_shop.Controllers;

import com.example.game_shop.Entities.User;
import com.example.game_shop.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser (@PathVariable int id){
        User user = userService.getUser(id);
        return user;
    }



    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        userService.saveUsers(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userService.saveUsers(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "User\n" +
                "id: " + id + ", has been delete!";
    }


}
