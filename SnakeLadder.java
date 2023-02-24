package com.snake_ladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player is at Position " + position);

        int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;

        // use for get options
        int options = (int) Math.floor(Math.random() * 10) % 3;

        switch (options) {
            case 1:
                // snake
                position = position - randomDiceNumber;
                if (position < 0) {
                    position = 0;
                }
                break;
            case 2:
                // ladder
                // increasing position of player by adding randomDiceNumber variable
                position =  position + randomDiceNumber;
                break;
            default:
                // no play
                // position remains same
                position = position;
                break;
        }

        System.out.println("final Position " + position);
    }
}
