/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.rps;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Adam
 */
public class Main {

    public static void main(String[] args) {
       //playRps();
       JFrame frame = new JFrame("Rock Paper Scissors");
       RPSPanel panel = new RPSPanel();
       
       frame.add(panel);
       frame.setSize(530,310);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setVisible(true);
    }
}
