package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_tv 
	implements ActionListener {
		 JButton button = new JButton("Duck Song");
	     JButton b=new JButton("Desert Frog");
	     JButton f=new JButton("Fluffy Unicorn Song");
	  
	     
		
			 public void showButton() {
		         System.out.println("Button clicked");
		         JFrame k=new JFrame();
		         k.setVisible(true);
		         JPanel j=new JPanel();
		         k.add(j);
		         j.add(button);
		         j.add(b);
		         j.add(f);
		         k.pack();
		         button.addActionListener(this);
		         b.addActionListener(this);
		         f.addActionListener(this);
	}



			@Override
			public void actionPerformed(ActionEvent e) {
				JButton buttonPressed = (JButton) e.getSource();
				if(buttonPressed.equals(button)){	showDucks();}
				else if(buttonPressed.equals(b)) {showFrog();}
				else if(buttonPressed.equals(f)) {showFluffyUnicorns();}
			} 
				// TODO Auto-generated method stub
				void showDucks() {
				 playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
				}

				void showFrog() {
				     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
				}

				void showFluffyUnicorns() {
				     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
				}

				void playVideo(String videoID) {
				     try {
				          URI uri = new URI(videoID);
				          java.awt.Desktop.getDesktop().browse(uri);
				     } catch (Exception e) {
				          e.printStackTrace();
				     }
				
			}

}