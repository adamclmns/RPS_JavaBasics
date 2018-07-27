/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.rps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Rock, Paper, Scissors ---");

//        Prompt for the player’s name
        System.out.println("What's your name");
        String playerName = scanner.next();

        boolean userContinues = true;
//       Enter game loop (do{game} while ( userContinues == true )
        do {
            //            Prompt user for choice (rock, paper, scissors)
            System.out.println("Rock, Paper, or Scissors?");
            String userChoice = scanner.next();
            //            Program randomly chooses (rock, paper, scissors)
            // https://stackoverflow.com/a/363692 
            Random rand = new Random();
            int compChoice = rand.nextInt(3)+1;
            System.out.println("Random Number: " + compChoice);
            // 1 == Rock
            // 2 == Paper
            // 2 == Scissors
            //            Evaluate outcome. 
            if (userChoice.equalsIgnoreCase("ROCK")) {
                if (compChoice == 1) {
                    System.out.println("TIE");
                } else if (compChoice == 2) {
                    System.out.println("Computer Wins!");
                } else if (compChoice == 3) {
                    System.out.println("User Wins!");
                }
            } else if (userChoice.equalsIgnoreCase("PAPER")) {
                if (compChoice == 1) {
                    System.out.println("User Wins!");
                } else if (compChoice == 2) {
                    System.out.println("TIE");
                } else if (compChoice == 3) {
                    System.out.println("Computer Wins!");
                }
            } else if (userChoice.equalsIgnoreCase("SCISSORS")) {
                if (compChoice == 1) {
                       System.out.println("Computer Wins");
                } else if (compChoice == 2) {
                        System.out.println("User wins");
                } else if (compChoice == 3) {
                    System.out.println("TIE");
                }
            }
                
            //            Output the outcome.
            
            //            Ask user if they want to continue (userContinues)
            System.out.println("Do you want to continue playing?");
            System.out.println("Y or N");
            String keepPlaying = scanner.next();
            if(keepPlaying.equalsIgnoreCase("Y")){
                userContinues = true;
            }else {
                userContinues = false;
            }
        } while (userContinues);

//        Exit.
    }
}
