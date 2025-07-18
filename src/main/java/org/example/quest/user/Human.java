package org.example.quest.user;

import org.example.quest.game.Game;
import org.example.quest.game.HumanWay;

public class Human extends Player{
    Game game;
    Race race;

    public Human(String name) {
        super(name);
        race = Race.HUMAN;
        game = new HumanWay();
    }

    @Override
    public Game getGame() {return game;}

}
