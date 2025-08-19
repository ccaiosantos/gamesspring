package com.projectgames.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;

    public BelongingPK(){

    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(gameList, that.gameList) && Objects.equals(games, that.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameList, games);
    }
}
