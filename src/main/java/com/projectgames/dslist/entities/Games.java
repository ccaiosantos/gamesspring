package com.projectgames.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity //configurar a classe java para seja equivalente a uma tabela do banco relacional
@Table(name="tb_game") //nome da tabela
public class Games {
    @Id //Indicar que ele é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para ser autoincrementavel no banco de dados/forma para o banco gerar o ID
    private Long id;
    private String title;
    @Column(name="game_year")//customizar a coluna no banco de dados
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")//PARA SER UM TEXTO NO BANCO DE DADOS
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Games(){
    }

    public Games(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    //comparar os jogos/comparar um objeto com o outro
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Games games)) return false;
        return Objects.equals(id, games.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
