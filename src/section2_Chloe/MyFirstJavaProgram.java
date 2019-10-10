package section2;

import java.awt.Color;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Bob= new Robot();
	Bob.sparkle();
	Bob.setSpeed(100);
	Bob.penDown();
	Bob.setPenColor(Color.CYAN);
	Bob.setPenWidth(300);
	Bob.move(100);
	Bob.turn(90);
	Bob.move(100);
	Bob.turn(90);
	Bob.miniaturize();
	Bob.move(100);
	Bob.turn(90);
	Bob.move(100);
	for (int i = 0; i < 3; i++) {
		Bob.move(100);
		Bob.turn(120);
		
		
	}
	}
	
	
		
		}

