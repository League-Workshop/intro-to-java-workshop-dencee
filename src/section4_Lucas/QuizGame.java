package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
	int score = 0;
		// 2.  Ask the user a question 
		String equals = JOptionPane.showInputDialog("What is 300 x 6");
		// 3.  Use an if statement to check if their answer is correct
		if(equals.equals("1800")) { 
			score = score+1;
	
		} else {
			JOptionPane.showMessageDialog(null, "Wrong no points added.");
			
		}
		JOptionPane.showMessageDialog(null, "Score now: "+score);
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Q2 = JOptionPane.showInputDialog("What is 3 x 15");
		if(Q2.equals("45")) {
		score = score+1;
		JOptionPane.showMessageDialog(null, "Score now 2");
		} else {
			JOptionPane.showMessageDialog(null, "Your wrong no points added");
			
		}
		JOptionPane.showMessageDialog(null, "Score now: "+score);
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
