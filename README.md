# StrategyDesignPattern
Simple implementation of the strategy design pattern

Strategy pattern comprises of a family of algorithms which have a common encapsulated supertype (interface/abstract class). Each algorithm is interchangeable with the other since it is basically of the same supertype. Strategy is loosely coupled with the client through composition.

In our case, we have an abstract class Animal which is inherited by a Pigeon, a Snake and a Tiger class. EatingBehaviour and SoundBehaviour are composed into the Animal class. Any concrete implementation of the former can be assigned to our client ie the Animal class at runtime. More behaviours can be added without having to change the already written code.
To run the demo code,

javac main Simulator.java

java main.Simulator

The output shows that not just that the Animal and eating behaviour are decoupled, but eating behaviour can be re-assigned at runtime. 
