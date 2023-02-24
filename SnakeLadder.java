package com.snake_ladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player is at Position " + position);

        // adding random function for dice number(1 to 6)
        int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;

        System.out.println("Dice number is " + randomDiceNumber);
    }
}
