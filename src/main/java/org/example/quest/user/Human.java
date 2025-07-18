package org.example.quest.user;

import org.example.quest.game.Game;
import org.example.quest.game.HumanWay;

public class Human extends Player{
    Game game;
    public Human(String name) {
        super(name);
        Race race = Race.HUMAN;
        game = new HumanWay();
    }

    @Override
    public String say() {
        return "i'm a Human, my name is " + this.getName();
    }
    @Override
    public Game getGame() {return game;}

}
