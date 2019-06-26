package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
String response = JOptionPane.showInputDialog("enter a adjective");
String response1 = JOptionPane.showInputDialog("enter a liquid");// Get the user to enter a type of liquid

		// Get the user to enter a body part
String response2 = JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
String response3 = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
String response4 = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
String story = "Piranhas are more "+response+"  during the day, so cross the river at night. piranhas are attracted to fresh"+response2+" and will most likely take a bite of your "+response2+" if you "+response3+" Whatever you do if you have a open wound, try to find another way to get to"+response4+". good luck";
JOptionPane.showMessageDialog(null, story);
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

