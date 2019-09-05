package game;

import game.behavior.AxeBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a king!");
    }
}
