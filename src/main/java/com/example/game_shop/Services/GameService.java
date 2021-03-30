package com.example.game_shop.Services;

import com.example.game_shop.Entities.Game;

import java.util.List;

public interface GameService {
    List<Game> getAllGames();

    void saveGame(Game game);

    Game getGame(int id);

    void deleteGame(int id);
}
