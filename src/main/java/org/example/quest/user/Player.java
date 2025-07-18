package org.example.quest.user;

import org.example.quest.game.Game;

public abstract class Player {
    private static int gameCounter = 0;
    private String name;
    private Race race;
    private Game game;


    public Player(String name) {
        this.name = name;
    }

    public Race getRace() {return race;}
    public void setRace(Race race) {this.race = race;}
    public void incrementGameCounter() {gameCounter++;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public Game getGame() {return game;}

}
