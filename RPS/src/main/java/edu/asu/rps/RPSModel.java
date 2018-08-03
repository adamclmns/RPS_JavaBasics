/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.rps;

import java.util.HashMap;

/**
 *
 * @author Adam
 */
public class RPSModel {
    private HashMap<Integer, String> options = new HashMap<>();
    private HashMap<String, String> outcomeMessages = new HashMap<>();
    private String computerChoice;
    private String userChoice;
    private String outputLabel;
    
    private boolean rockEnabled;
    private boolean paperEnabled;
    private boolean scissorsEnabled;
    private boolean resetEnabled;
    
    
    public RPSModel(){
        options.put(1, "ROCK");
        options.put(2, "PAPER");
        options.put(3, "SCISSORS");
        
        rockEnabled = true;
        paperEnabled = true;
        scissorsEnabled=true;
        resetEnabled = false;
        
        outputLabel = "";
        
        outcomeMessages.put("RL","Computer chose - ROCK. You Lost");
        outcomeMessages.put("RW","Computer chose - ROCK. You won!");
        outcomeMessages.put("PL","Computer chose - PAPER. You Lost");
        outcomeMessages.put("PW","Computer chose - PAPER. You won!");
        outcomeMessages.put("SL","Computer chose - SCISSORS. You Lost");
        outcomeMessages.put("SW","Computer chose - SCISSORS. You won!");
        outcomeMessages.put("TIE","It's a Tie!");
        
        
    }
    
    // Generate - Right-Click > Insert Code ... > Getters and Setters... > Choose All

    public HashMap<Integer, String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<Integer, String> options) {
        this.options = options;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public String getOutputLabel() {
        return outputLabel;
    }

    public void setOutputLabel(String finalState) {
        this.outputLabel = finalState;
    }

    public boolean isRockEnabled() {
        return rockEnabled;
    }

    public void setIsRockEnabled(boolean isRockEnabled) {
        this.rockEnabled = isRockEnabled;
    }

    public boolean isPaperEnabled() {
        return paperEnabled;
    }

    public void setIsPaperEnabled(boolean isPaperEnabled) {
        this.paperEnabled = isPaperEnabled;
    }

    public boolean isScissorsEnabled() {
        return scissorsEnabled;
    }

    public void setIsScissorsEnabled(boolean isScissorsEnabled) {
        this.scissorsEnabled = isScissorsEnabled;
    }

    public boolean isResetEnabled() {
        return resetEnabled;
    }

    public void setIsResetEnabled(boolean isResetEnabled) {
        this.resetEnabled = isResetEnabled;
    }

    public HashMap<String, String> getOutcomeMessages() {
        return outcomeMessages;
    }
    
}
