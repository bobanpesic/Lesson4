package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	
	Robot boby = new Robot();

	void go() {
		
		boby.setSpeed(200);

		int length = 50;

		for (int i = 0; i < 60; i++) {
			boby.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			boby.turn(6);
		}
	
	}

	private void drawTriangle(int length) {
		boby.penDown();
		
		for (int i = 0; i < 3; i++) {
			boby.move(length);
			boby.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
