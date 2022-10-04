package org.example;
import java.util.Scanner;

class GuessingNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = 1 + (int)(100*Math.random());
        int guess;
        int i = 1;

        System.out.println("Welcome! Choose a number between 1 to 100. " +
                "Don't worry if you guess wrong on your first try. " +
                "You have 10 chances total! Good luck! ");
        try {
            while (i < 10) {
                System.out.println("Your guess is: "  );
                guess = scan.nextInt();
                int remaining = 10-i;

                if (guess < 0 || guess > 100) {
                    System.out.println("Number is out of range!");
                }

                if (rand == guess) {
                    System.out.println("Oooga booga, You win!! You guess number " + guess + " on " + i + " try.");
                    break;
                } else if (rand > guess) {
                    System.out.println("Oh no! Your guess " + guess + " is too low! You have " +  remaining + " guesses left!");
                } else if (rand < guess){
                    System.out.println("Ah! Your guess " + guess + " is too high! You have " + remaining + " guesses left!");
                }

                if (i == 9) {
                    System.out.println("Sorry, you have use up all your guesses! You lose! The number was " + rand);
                }
                i++;
            }
        } catch (Exception e) {
                System.out.println("Please enter a whole number between 1 - 100, and try again!");
        }
        scan.close();
    }
}