package com.snake_ladder;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder program :");
        int position = 0;

        for ( position = 0; position < 100; position++) {

            int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1 ;
            int option = (int) Math.floor(Math.random() * 10) % 3;

            switch (option) {
                case 1:
                    // snake
                    position = position - randomDiceNumber;
                    if (position < 0) {
                        position = 0;
                    }
                    break;
                case 2:
                    // ladder
                    position = position + randomDiceNumber;
                    if (position > 100) {
                        position = position - randomDiceNumber;
                    }
                    break;
                default:
                    // no play
                    position = position;
                    break;

            }
            if (position == 100) {
                break;
            }
        }
        System.out.print("final Position of Player " + position + " ");
    }
}
