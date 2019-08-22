package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {		
	static Robot mike=new Robot ();
	public static void main(String[] args) { 

		mike.setX(100); 
		mike.setY(500);
		mike.setSpeed(60);
		mike.miniaturize();
		
		mike.penDown();
		mike.turn(90);
		mike.move(80);
		mike.turn(-90);
		for(int i=0;i<=10; i++) {
		drawHouse();
	
}
		

}
	static void drawHouse() {
		mike.move(100);
		mike.turn(90);
		mike.move(80);
		mike.turn(90);
		mike.move(100);
		mike.turn(-90);
		mike.move(40);
		mike.turn(-90);
	}
}
