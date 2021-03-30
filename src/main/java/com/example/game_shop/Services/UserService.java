package com.example.game_shop.Services;

import com.example.game_shop.Entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int id);

    void deleteUser(int id);
}
