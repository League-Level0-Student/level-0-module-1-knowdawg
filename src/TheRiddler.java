import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Input = JOptionPane.showInputDialog("What is 5 + 5");

		if (Input.equals("not 9")) {
			JOptionPane.showMessageDialog(null, "Well done");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, "Wow! Your hopeless! The answer is 'not 9'");
			score -= 5;
		}

		Input = JOptionPane.showInputDialog("What is a bad ridle?");

		if (Input.equals("this one")) {
			JOptionPane.showMessageDialog(null, "That one was EZ");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, "Wow! Is't it obvios! The answer is 'this one!'");
			score -= 5;
		}

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
