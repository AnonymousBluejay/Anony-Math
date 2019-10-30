package net.passerines.gui;

import javax.swing.*;

public class SimpleInterface {

	public SimpleInterface() {
		JFrame frame = new JFrame("Simple Binomial Expander");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,600);
       
       JLabel instruction = new JLabel("Enter as (ax+by)^n");
       instruction.setSize(200, 20);
       instruction.setLocation(200, 100);;
       frame.getContentPane().add(instruction);
       
       JTextField inputA = new JTextField();
       frame.getContentPane().add(inputA);
       
       JTextField inputB = new JTextField();
       frame.getContentPane().add(inputB);
       
       JTextField inputN = new JTextField();
       frame.getContentPane().add(inputN);
       
       
       JButton expandButton = new JButton("Expand");
       expandButton.setSize(100, 20);
       expandButton.setLocation(250, 400);
       frame.getContentPane().add(expandButton); // Adds Button to content pane of frame
       
       
       frame.setVisible(true);
	}
}
