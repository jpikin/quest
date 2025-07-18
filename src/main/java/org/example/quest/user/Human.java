package org.example.quest.user;

import org.example.quest.game.Game;
import org.example.quest.game.HumanWay;

public class Human extends Player{

    public Human(String name) {
        super(name);
        Race race = Race.HUMAN;
        Game game = new HumanWay();
    }

    @Override
    public String say() {
        return "i'm a Human, my name is " + this.getName();
    }

}
