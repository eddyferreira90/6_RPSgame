package org.academia.bootcamp;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {



        Players[] players = new Players[]{new Players("Jorge"), new Players("Jorgina")};

        GameLogic start = new GameLogic();
        start.StartGame(players);




    }
}