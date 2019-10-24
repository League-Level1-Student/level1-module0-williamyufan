package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class sound_effects_machine 
	implements ActionListener {
	 JButton button = new JButton();
     JButton b=new JButton();
     JButton f=new JButton();
     JButton y=new JButton();
  
     
	
		 public void showButton() {
	         System.out.println("Button clicked");
	         JFrame k=new JFrame();
	         k.setVisible(true);
	         JPanel j=new JPanel();
	         k.add(j);
	         j.add(button);
	         j.add(b);
	         j.add(f);
	         j.add(y);
	         k.pack();
	         button.addActionListener(this);
	         b.addActionListener(this);
	         f.addActionListener(this);
	         y.addActionListener(this);
}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button)){	playSound("6.wav");}
		else if(buttonPressed.equals(b)) {playSound("9.wav");}
		else if(buttonPressed.equals(f)) {playSound("0.wav");}
		else if(buttonPressed.equals(y)) {playSound("8.wav");
		}
			
		}

private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}}

