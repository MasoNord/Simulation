package org.example.geneticsimulation.entity;

public class Predator extends Creature{
    private int strength;

    public Predator(int speed, int hp, int strength, Coordinates coordinatesc) {
        super(speed, hp, coordinatesc);
        this.strength = strength;
    }

    @Override
    void makeMove() {

    }
}
