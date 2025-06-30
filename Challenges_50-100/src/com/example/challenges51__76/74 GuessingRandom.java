package com.example.challenges51__76;

import java.util.Scanner;

class GuessingRandom {
    int random;

    GuessingRandom(){
        random=(int)Math.ceil(Math.random()*100);
    }

    /**
     * @param guessNumber the number that player guessed
     * @return
     * -Negative if the guessed number is smaller
     * -0 if the guessed number id correct.
     * -Positive if the guessed number is higher
     */

    int guess (int guessNumber){
        return guessNumber-random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingRandom game= new GuessingRandom();
        System.out.println("Welcome to the guessing game. Guss the number between 1 to 100.");
        int guess;
        int result;
        do {
            System.out.println("Guess the Number :");
            guess=input.nextByte();
            result=game.guess(guess);
            if (result==0){
                System.out.println("You won!");
            }else if (result<0){
                System.out.println("Guess Higher.");
            }else {
                System.out.println("Guess Lower.");
            }

        }while (result!=0);
    }
}
