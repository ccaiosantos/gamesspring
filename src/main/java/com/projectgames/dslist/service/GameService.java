package com.projectgames.dslist.service;

import com.projectgames.dslist.controller.GameController;
import com.projectgames.dslist.dto.GameDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.entities.Games;
import com.projectgames.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//vai servir para ser um componente do sistema, injetando dependências de componentes
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findByid(Long id){
        Games result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findall(){
        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList(); //o to list vai servir para retornar uma list //a lista de games vai retornar a lista de gamesmindto
    }
}
