package org.example.quest.user;

public abstract class Player {
    private static int gameCounter = 0;
    String name;
    Race race;


    public Player(String name) {
        this.name = name;
    }

    public Race getRace() {return race;}
    public void setRace(Race race) {this.race = race;}
    public void incrementGameCounter() {gameCounter++;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
}
