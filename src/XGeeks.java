
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String MattsSuperpower = "Talking with cats";
		String NolansSuperpower = "Fat minipulation";
		String MaClarynsPower = "flying";
		String JensensPower = "turning into a fox";
		String DaelynsPower = "crustean mimicry";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Matt")) {
			JOptionPane.showMessageDialog(null, "Your super power is " + MattsSuperpower);
		} else {
			if (name.equals("Nolan")) {
				JOptionPane.showMessageDialog(null, "Your super power is " + NolansSuperpower);
			} else {
				if (name.equals("MaClaryn")) {
					JOptionPane.showMessageDialog(null, "Your super power is " + MaClarynsPower);
				} else if (name.equals("Jensen")) {
					JOptionPane.showMessageDialog(null, "Your super power is " + JensensPower);
				} else {
					if (name.equals("Daelyn")) {
						JOptionPane.showMessageDialog(null, "Your super power is " + DaelynsPower);
					} else {

						JOptionPane.showMessageDialog(null, "Your super power is NOTHING");
					}
				}
			}
		}
	}
}