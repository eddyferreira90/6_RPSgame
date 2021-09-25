package org.academia.bootcamp;

public enum Moves {
        ROCK,
        PAPER,
        SCISSORS;

    public  Moves randomChoice(){
        return Moves.values()[ (int) Math.floor(Math.random()*3)];
    }
}