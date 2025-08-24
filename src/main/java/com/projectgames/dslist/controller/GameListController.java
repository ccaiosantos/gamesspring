package com.projectgames.dslist.controller;

import com.projectgames.dslist.dto.GameListDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.service.GameListService;
import com.projectgames.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(value = "list")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService; //teve que trazer o service do game pois ele vai retornar os games so que na lista

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
