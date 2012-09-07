package com.xawiahn.ovningsuppgifter;
import static javax.swing.JOptionPane.*;

public class main {
	public static void main(String[] args) {
		String indata;
		double mangd, langd, summa; 
		//1 mile = 1.609km, 1 gallon = 3.785 liter
		indata = showInputDialog("Hur många miles?");
		langd = Double.parseDouble(indata);
		indata = showInputDialog("Hur många gallon?");
		mangd = Double.parseDouble(indata);
		langd *= 1.609;
		mangd *= 3.785;
		summa = mangd/langd;
		showMessageDialog(null, summa + " liter/" + "mil.");
	}
}
