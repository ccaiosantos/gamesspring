package com.projectgames.dslist.controller;

import com.projectgames.dslist.dto.GameDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.entities.Games;
import com.projectgames.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//sera a porta de entrada para o backend/ a API
@RestController
@RequestMapping(value = "/games")//para mapear os games na porta
public class GameController {

    @Autowired
    private GameService gameService;
     //para mapear
    @GetMapping(value = "/{id}")
    public GameDTO findByid(@PathVariable Long id) {
        GameDTO result = gameService.findByid(id);
        return result;
    }


    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findall();
        return result;
        }

    }

