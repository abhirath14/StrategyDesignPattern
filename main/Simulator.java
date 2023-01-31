package main;
import main.animals.*;
import main.strategies.eat.*;


public class Simulator {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.makeSound();
        tiger.eat();
        tiger.setEatBehaviour(new EatRats());
        tiger.eat();
    }
}
