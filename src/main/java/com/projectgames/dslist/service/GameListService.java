package com.projectgames.dslist.service;

import com.projectgames.dslist.dto.GameListDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.entities.GameList;
import com.projectgames.dslist.entities.Games;
import com.projectgames.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();}
}
