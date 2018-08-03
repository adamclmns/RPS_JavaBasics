/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.rps;

import java.util.Random;

/**
 *
 * @author Adam
 */
public class RPSController {


    
    private static void updateModel(RPSModel model){
        // update the model based on the event recieved from the view.
    }
   
    
    private void seeWhoWon(RPSModel model) {
       
        String userChoice = model.getUserChoice();
        String computerChoice = model.getComputerChoice();
        // Add Computer Choice to FinalState Output
        String result = "";
        // If Tie, let's figure it out now.
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            result = model.getOutcomeMessages().get("TIE");
        } else if (userChoice.equalsIgnoreCase("ROCK")) {
            if (computerChoice.equalsIgnoreCase("PAPER")) {
                result = model.getOutcomeMessages().get("PW");
            } else if (computerChoice.equalsIgnoreCase("SCISSORS")) {
                result = model.getOutcomeMessages().get("SL");
            }
        } else if (userChoice.equalsIgnoreCase("PAPER")) {
            if (computerChoice.equalsIgnoreCase("ROCK")) {
               result = model.getOutcomeMessages().get("RL");
            }
            if (computerChoice.equalsIgnoreCase("SCISSORS")) {
               result = model.getOutcomeMessages().get("SW");
            }
        } else if (userChoice.equalsIgnoreCase("SCISSORS")) {
            if (computerChoice.equalsIgnoreCase("ROCK")) {
               result = model.getOutcomeMessages().get("RW");
            } else if (computerChoice.equalsIgnoreCase("PAPER")) {
                result = model.getOutcomeMessages().get("PL");
            }
        }
        model.setOutputLabel(result);
        model.setIsResetEnabled(true);
    }
    
       /* Custom Game Methods here   */
    private void getComputerChoice(RPSModel model) {
        model.setIsResetEnabled(false);
        model.setIsRockEnabled(true);
        model.setIsPaperEnabled(true);
        model.setIsScissorsEnabled(true);
        //            Program randomly chooses (rock, paper, scissors)
        // https://stackoverflow.com/a/363692 
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;
        String compChoice = model.getOptions().get(randomNumber);
        model.setComputerChoice(compChoice);
        //outputLabel.setText(""); // Blanks the OutputLabel 
    }
}
    
