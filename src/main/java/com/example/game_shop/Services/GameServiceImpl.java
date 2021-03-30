package com.example.game_shop.Services;

import com.example.game_shop.Entities.Game;
import com.example.game_shop.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService{

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public void saveGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public Game getGame(int id) {
        Game game = null;
        Optional<Game> optional = gameRepository.findById(id);
        if(optional.isPresent()){
            game = optional.get();
        }
        return game;
    }

    @Override
    public void deleteGame(int id) {
        gameRepository.deleteById(id);
    }
}
