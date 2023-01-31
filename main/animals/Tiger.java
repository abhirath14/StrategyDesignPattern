package main.animals;
import main.strategies.sound.*;
import main.strategies.eat.*;


public class Tiger extends Animal{
    public Tiger() {
        this.setMakeSoundBehaviour(new Growl());
        this.setEatBehaviour(new EatDeer());
    }
    public void display() {
        System.out.println("Display Tiger");
    }
}
