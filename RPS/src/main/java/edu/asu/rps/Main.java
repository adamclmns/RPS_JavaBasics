/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// TODO: Modulus implementation for who-wins.
// TODO: JavaDoc and Unit tests (Possible maven-generated grades)
// TODO: Rubric for assignments
// TODO: Label CS1.* REFs
package edu.asu.rps;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class Main {

    private static RPSPanel view;
    private static RPSModel model;
    private static RPSController controller;

    public static void controllerHandleEvent() {

    }

    public static void viewUpdateFromModel() {

    }

    public static void main(String[] args) {
        // Our Application is running in a static Context

        //playRps();
        JFrame frame = new JFrame("Rock Paper Scissors");

        model = new RPSModel();
        view = new RPSPanel(model);
        controller = new RPSController();

        frame.add(view);
        frame.setSize(530, 310);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    // The Panel will call this static method, and take an action.
    public static void handleEventFromView(String event) {
        model.setComputerChoice(getComputerChoice());
        String action = event.toUpperCase();
        if (action.contains("ROCK")) {
            model.isPaperEnabled();
            model.isResetEnabled();
            model.isRockEnabled();
            model.isScissorsEnabled();
            model.setUserChoice(model.getOptions().get(1)); // We know that "ROCK" is 1, look at the model.
            // Do Rock action
        } else if (action.contains("PAPER")) {
            // Do Paper Action
            model.isPaperEnabled();
            model.isResetEnabled();
            model.isRockEnabled();
            model.isScissorsEnabled();
            model.setUserChoice(model.getOptions().get(2)); // We know that "ROCK" is 1, look at the model.
            // Do Rock action
        } else if (action.contains("SCISSORS")) {
            // Do Scissors Action
            model.isPaperEnabled();
            model.isResetEnabled();
            model.isRockEnabled();
            model.isScissorsEnabled();
            model.setUserChoice(model.getOptions().get(3)); // We know that "ROCK" is 1, look at the model.
            // Do Rock action
        } else {
            
            JOptionPane.showMessageDialog(null, "Event STRING is not implemented yet... sorry.");
        }
    }
}
