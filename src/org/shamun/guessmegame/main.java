package org.shamun.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Please Enter your name");

        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Shall we start?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer !=1){
            System.out.println("Shall we start?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            beginAnswer=scanner.nextInt();
        }

        Random random =new Random();
        int x = random.nextInt(20) +1;
        System.out.println("Please guess a number: ");
        int userInput =scanner.nextInt();

        int timesTried = 0;
        boolean hasWon =false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timesTried++;

            if (timesTried<5){
              if (userInput ==x){
                  hasWon=true;
                  shouldFinish=true;
              }else if (userInput > x){
                  System.out.println("Guess lower");
                  userInput= scanner.nextInt();
              }else{
                  System.out.println("Guess higher");
                  userInput = scanner.nextInt();
              }
            }else {
                shouldFinish=true;
            }
        }

        if (hasWon){
            System.out.println("Congratulation! You have guessed in your " + timesTried + " guess");
        }else {
            System.out.println("Game over!");
            System.out.println("The number was " + x);
        }
    }
}


