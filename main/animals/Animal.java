package main.animals;

import main.strategies.eat.*;
import main.strategies.sound.*;

public abstract class Animal {
    EatBehaviour eatBehaviour;
    SoundBehaviour soundBehaviour;
    public Animal() {}
    public void setEatBehaviour(EatBehaviour eatBehaviour) {
      this.eatBehaviour = eatBehaviour;
    }
    public void setMakeSoundBehaviour(SoundBehaviour soundBehaviour) {
      this.soundBehaviour = soundBehaviour;
    }
    public void eat() {
      this.eatBehaviour.eat();
    }
    public void makeSound() {
      this.soundBehaviour.makeSound();
    }
    public abstract void display();
    public void rest() {
      System.out.println("Animal is resting");
    }
  }