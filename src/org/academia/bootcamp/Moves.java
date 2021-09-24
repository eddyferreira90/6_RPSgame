package org.academia.bootcamp;

public enum Moves {
        ROCK ( "R"),
        PAPER ( "P"),
        SCISSORS ( "S");

        private String symbol;

        Moves(String symbol) {
              this.symbol = symbol;
        }

        public String getSymbol() {
                return symbol;
        }

        public static String ShowPossibilities() {
               String result = "Available Possibilities: ";

               for(Moves rps : Moves.values()) {
                      result += rps.symbol + " ";
               }

               return result;
        }
}
