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
		String p="";
		
			String y="";
			if(x==0) {
				y="small";
				p="red";
			}
			if(x==1) {
				y="medium";
			p="green";
			}
			if(x==2) {
				y="large";
			p="blue";
			}
		drawHouse(y,p);
	
}
		

}
	static void drawHouse(String height, String color) {
		
		
		if(color.equals("red")) {mike.setPenColor(150, 0, 0);}
		if(color.equals("green")) {mike.setPenColor(0, 150, 0);}
		if(color.equals("blue")) {mike.setPenColor(0, 0, 150);}
	
		int size=0;
		if(height.equals("small")) {size=60;}
		if(height.equals("medium")) {size=120;}
		if(height.equals("large")) {size=250;}
		
		mike.move(size);
		if(height.equals("large")) {drawFlatRoofs();}
		else {drawPointyRoofs();}
		
		mike.move(size);
		mike.turn(-90);
		mike.move(40);
		mike.turn(-90);
		
	}
	static void  drawPointyRoofs() {
		mike.turn(45);
		mike.move(45);
		mike.turn(90);
		mike.move(45);
		mike.turn(45);
		
	}
	static void drawFlatRoofs() {
		mike.turn(90);
		mike.move(80);
		mike.turn(90);
	}
}
