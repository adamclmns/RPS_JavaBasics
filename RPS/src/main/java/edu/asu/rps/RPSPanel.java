/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.asu.rps;


import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Adam
 */
public class RPSPanel extends javax.swing.JPanel {

    HashMap<Integer, String> options = new HashMap<>();
    String computerChoice;
    String userChoice;
    String finalState;

    /**
     * Creates new form RPSPanel
     */
    public RPSPanel() {
        initComponents();
        options.put(1, "ROCK");
        options.put(2, "PAPER");
        options.put(3, "SCISSORS");
        outputLabel.setText("");
        // Computer makes a choice
        getComputerChoice();
    }

    /* Custom Game Methods here   */
    private void getComputerChoice() {
        userContinues.setEnabled(false);
        rockButton.setEnabled(true);
        paperButton.setEnabled(true);
        scissorsButton.setEnabled(true);
        //            Program randomly chooses (rock, paper, scissors)
        // https://stackoverflow.com/a/363692 
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;
        String compChoice = options.get(randomNumber);
        this.computerChoice = compChoice;
        outputLabel.setText(""); // Blanks the OutputLabel 
    }

    private void seeWhoWon() {
       
        
        // Add Computer Choice to FinalState Output
        finalState = "";
        finalState = "Computer Chose: "+computerChoice+" ";
        // If Tie, let's figure it out now.
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            finalState += "It's a Tie!";
        } else if (userChoice.equalsIgnoreCase("ROCK")) {
            if (computerChoice.equalsIgnoreCase("PAPER")) {
                finalState += "Computer Wins!";
            } else if (computerChoice.equalsIgnoreCase("SCISSORS")) {
                finalState += "User Wins!";
            }
        } else if (userChoice.equalsIgnoreCase("PAPER")) {
            if (computerChoice.equalsIgnoreCase("ROCK")) {
               finalState += "User Wins!";
            }
            if (computerChoice.equalsIgnoreCase("SCISSORS")) {
                finalState += "Computer Wins!";
            }
        } else if (userChoice.equalsIgnoreCase("SCISSORS")) {
            if (computerChoice.equalsIgnoreCase("ROCK")) {
                finalState += "Computer Wins";
            } else if (computerChoice.equalsIgnoreCase("PAPER")) {
                finalState += "User Wins!";
            }
        }
        outputLabel.setText(finalState);
        userContinues.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPrompt = new javax.swing.JLabel();
        rockButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        scissorsButton = new javax.swing.JButton();
        userContinues = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(530, 310));
        setMinimumSize(new java.awt.Dimension(530, 310));

        userPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userPrompt.setText("Choose Rock, Paper, or Scissors");

        rockButton.setText("Rock");
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });

        paperButton.setText("Paper");
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });

        scissorsButton.setText("Scissors");
        scissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtonActionPerformed(evt);
            }
        });

        userContinues.setText("Restart Game");
        userContinues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userContinuesActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Reprise Stamp", 1, 18)); // NOI18N
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputLabel.setText("Computer Chose Scissors, Computer Wins!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userContinues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paperButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(scissorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(outputLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rockButton)
                    .addComponent(paperButton)
                    .addComponent(scissorsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userContinues)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userContinuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userContinuesActionPerformed
        // TODO add your handling code here:
        getComputerChoice();
    }//GEN-LAST:event_userContinuesActionPerformed

    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        // TODO add your handling code here:
        userChoice = "ROCK";
        seeWhoWon();
        
        paperButton.setEnabled(false);
        scissorsButton.setEnabled(false);
    }//GEN-LAST:event_rockButtonActionPerformed

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        // TODO add your handling code here:
        userChoice = "PAPER";
        seeWhoWon();
        rockButton.setEnabled(false);
        scissorsButton.setEnabled(false);
    }//GEN-LAST:event_paperButtonActionPerformed

    private void scissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtonActionPerformed
        // TODO add your handling code here:
        userChoice = "SCISSROS";
        seeWhoWon();
         rockButton.setEnabled(false);
        paperButton.setEnabled(false);
        
    }//GEN-LAST:event_scissorsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton paperButton;
    private javax.swing.JButton rockButton;
    private javax.swing.JButton scissorsButton;
    private javax.swing.JButton userContinues;
    private javax.swing.JLabel userPrompt;
    // End of variables declaration//GEN-END:variables
}
