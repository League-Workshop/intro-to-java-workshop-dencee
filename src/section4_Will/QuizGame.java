package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String joe = JOptionPane.showInputDialog("what color is your hair");
		// 3. Use an if statement to check if their answer is correct
		if (joe.equals("black")) {
			score += 1000;
		}
		// 4. if the user's answer was correct, add one to their score
		JOptionPane.showMessageDialog(null, ("score is" + score));

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String joe1 = JOptionPane.showInputDialog("who is the person to my left");
		if (joe1.equals("max")) {
			score += 1000;
		}
		// 6. After all the questions have been asked, print the user's score

		JOptionPane.showMessageDialog(null, ("score is" + score));
		String joe3 = JOptionPane.showInputDialog("what is the guy who does magics name");
		if (joe3.equals("keith")) {
			score += 1000;
		}
		JOptionPane.showMessageDialog(null, ("score is" + score));
		String joe4 = JOptionPane.showInputDialog("what did daniel used to call me at the start");
		if (joe4.equals("lucas")) {
			score += 1000;
		}
		JOptionPane.showMessageDialog(null, ("score is" + score));
		String joe5 = JOptionPane.showInputDialog("what color is my phone");
		if (joe5.equals("green and blue")) {
			score += 1000;
		}
		JOptionPane.showMessageDialog(null, ("score is" + score));
		
	}
}
