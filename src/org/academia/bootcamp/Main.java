package org.academia.bootcamp;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {



        Players player1 = new Players("Jorge");
        Players player2 = new Players("Manel");

        GameLogic start = new GameLogic();
        start.StartGame(player1, player2);




    }
}