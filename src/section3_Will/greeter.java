package section3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String response = JOptionPane.showInputDialog ("what is your name human");
		System.out.println(response);
		JOptionPane.showMessageDialog(null, response);
		JOptionPane.showMessageDialog(null, "this is your computer hi");
	}

}
