package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bob = new Robot("batman");

	public static void main(String[] args) {
		// Make an obedient robot that will obey commands to draw shapes.

		// 1. Make a new class, create a main method, and show the robot.

		// 2. Have the robot draw a square.
		String color = JOptionPane
				.showInputDialog("Out of the primary colors what color do you want your shape to be?");
		if (color.equalsIgnoreCase("yellow")) {
			bob.setPenColor(Color.yellow);
		} else if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		} else {
			JOptionPane.showMessageDialog(null,
					"ERROR!!!!!! You haven't typed in one of the valid choices. I am going to use a random color.");
			bob.penDown();
			bob.setRandomPenColor();
		}

		String shape = JOptionPane
				.showInputDialog("Out of a circle, a triangle, and a square," + " what do you want me to draw?");
		if (shape.equalsIgnoreCase("circle")) {
			drawCircle();
		} else if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else {
			JOptionPane.showMessageDialog(null, "ERROR!!!!!! You haven't typed in one of the valid choices.");
		}

	}

	// 3. Extract this code into a drawSquare() method.
	// 2. Have the robot draw a square.
	static void drawSquare() {

		bob.penDown();
		bob.setSpeed(1000);
		for (int i = 1; i < 5; i++) {
			bob.move(200);
			bob.turn(90);
		}

	}

	// 4. Have the robot draw a triangle.

	// 5. Extract this code into a drawTriangle() method.
	static void drawTriangle() {
		bob.setSpeed(1000);
		bob.penDown();
		bob.turn(45);
		for (int i = 1; i < 4; i++) {
			bob.move(200);
			bob.turn(120);
		}

	}

	// 6. Have the robot draw a circle.
	static void drawCircle() {
		bob.setSpeed(1000);
		bob.penDown();
		for (int i = 0; i < 360; i++) {
			bob.move(1);
			bob.turn(1);

		}

	}
	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape depending
	// on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on their
	// answer.

}
