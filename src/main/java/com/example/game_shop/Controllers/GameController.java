package com.example.game_shop.Controllers;

import com.example.game_shop.Entities.Game;
import com.example.game_shop.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<Game> showAllTrainers(){
        return gameService.getAllGames();
    }

    @GetMapping("/games/{id}")
    public Game getGame(@PathVariable int id){
        return gameService.getGame(id);
    }

    @PostMapping("/games")
    public Game addNewGame(@RequestBody Game game){
        gameService.saveGame(game);
        return game;
    }

    @PutMapping("/games")
    public Game updateGame(@RequestBody Game game){
        gameService.saveGame(game);
        return game;
    }

    @DeleteMapping("/games/{id}")
    public String deleteGame(@PathVariable int id){
        gameService.deleteGame(id);
        return "Game \n" +
                "id: "+ id + ", has been delete";
    }
}
