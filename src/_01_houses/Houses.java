package _01_houses;

import java.util.Random;

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
			Random mikejohnson=new Random();
			int x=mikejohnson.nextInt(3);
		String p="blue";
			String y="";
			if(x==0) {y="small";}
			if(x==1) {y="medium";}
			if(x==2) {y="large";}
		drawHouse(y,p);
	
}
		

}
	static void drawHouse(String height, String color) {
		
	mike.
		int size=0;
		if(height.equals("small")) {size=60;}
		if(height.equals("medium")) {size=120;}
		if(height.equals("large")) {size=250;}
		mike.move(size);
		mike.turn(90);
		mike.move(80);
		mike.turn(90);
		mike.move(size);
		mike.turn(-90);
		mike.move(40);
		mike.turn(-90);
	}
}
