package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
 int nickelsValue = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
 int dimesValue = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
int quartersValue = Integer.parseInt(quarters);
String pennies = JOptionPane.showInputDialog(null, "How many pennies do you have?");
int penniesValue = Integer.parseInt(pennies);
		// Calculate how much money the user has and save it in a double variable 
nickelsValue = nickelsValue * 5;
dimesValue = dimesValue * 10;
quartersValue = quartersValue * 25;
int change = nickelsValue + dimesValue + quartersValue + penniesValue;
int changeValue = change / 100;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" + changeValue + ".  Please insert $5.00 into the money slot.");
	}
}

