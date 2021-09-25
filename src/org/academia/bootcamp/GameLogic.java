package org.academia.bootcamp;

public class GameLogic {

    Moves newmove = Moves.ROCK;

    String one = "";
    String two = "";

    int p1wins = 0;
    int p2wins = 0;


    public void StartGame (Players player1, Players player2){

        for (int i = 0; i < 3; ) {
            switch (newmove.randomChoice()) {

                case ROCK:
                    one = "rock";
                    break;

                case PAPER:
                    one = "paper";
                    break;

                case SCISSORS:
                    one = "scissors";
                    break;

            }

            switch (newmove.randomChoice()) {

                case ROCK:
                    two = "rock";
                    break;

                case PAPER:
                    two = "paper";
                    break;

                case SCISSORS:
                    two = "scissors";
                    break;

            }

            if (one.equals("rock") && two.equals("rock") || one.equals("paper") && two.equals("paper") || one.equals("scissors") && two.equals("scissors")) {
                System.out.println(player1.GetName() + " chose " + one + " and " + player2.GetName() + " chose " + two + "\n" + "It's a tie!" + "\n");
            }
            if (one.equals("rock") && two.equals("scissors") || one.equals("paper") && two.equals("rock") || one.equals("scissors") && two.equals("paper")){
                i++;
                p1wins++;
                System.out.println("Win");
            }
            if (two.equals("paper") && one.equals("rock") || two.equals("rock") && one.equals("scissors") || two.equals("scissors") && one.equals("paper")){
                i++;
                p2wins++;
                System.out.println("Lost");
            }


        }

        if (p1wins > p2wins){
            System.out.println(player1.GetName() + " won with " + p1wins + " points");
        } else {
            System.out.println(player2.GetName() + " won with " + p2wins + " points");
        }
    }
}
