package org.academia.bootcamp;

public class Players {

    private String name;
    private int number;

    public Players(String name) {
        this.name = name;


    }

    public String GetName() {
        return name;
    }

    public int MakeMove() {
        number = (int) Math.ceil(Math.random() * 3);
        System.out.println(number);
        return number;

    }
}