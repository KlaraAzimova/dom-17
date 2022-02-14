package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal[] animals = {new Shark(), new Turtle(), new Eage()};
//        Shark[] sharks = {(Shark) animals[0]};
//        Turtle[] turtles = {(Turtle) animals[0]};
//        Eage[] eages = {(Eage) animals[0]};

        Animal shark = new Shark(850, "White", true);
        Animal eagle = new Eage(7, "Grey", 250);
        Animal turtle = new Turtle(35, "Brown", 85);
        Animal[] animals = {turtle, eagle, shark};


        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("homework17.Shark")) {
                ((Shark) a).attack();
            }

            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }
            if (a.getClass().getName().equals("homework17.Turtle")) {
                ((Turtle) a).swim();
            }
            if (a instanceof Eage) {
                ((Eage) a).fly();
            }
            if (a.getClass().getName().equals("homework17.Eagle")) {
                ((Eage) a).fly();
            }
            System.out.println();
        }
        Animal[] reptile = {turtle};
        Animal[] fish = {shark};
        Animal[] bird = {eagle};


    }
}

