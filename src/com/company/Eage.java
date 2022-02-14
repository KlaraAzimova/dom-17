package com.company;

public class Eage extends Animal {

    private int speed;

    public Eage() {
    }

    public Eage(double weight, String color, int speed) {
        super(weight, color);
        this.speed = speed;
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Eagle: " + '\n' +
                "speed: " + speed + '\n' +
                super.toString();
    }

}

