package org.example.geneticsimulation.entity;

abstract public class Creature extends Entity {
    private int speed;
    private int hp;
    private Coordinates coordinates;

    public Creature(int speed, int hp, Coordinates coordinates) {
        super(coordinates);
        this.speed = speed;
        this.hp = hp;
    }
    abstract void makeMove();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
