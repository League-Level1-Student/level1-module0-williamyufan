package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame k=new JFrame();
         k.setVisible(true);
         JButton button = new JButton();
         k.add(button);
         k.pack();
         button.addActionListener(this);
         
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "WooHoo!");
		
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
        
        if(rand==0) {
       	 JOptionPane.showMessageDialog(null, "You will get $1000 today!");
       	 
        }
        else if(rand==1) {
       	 JOptionPane.showMessageDialog(null, "You will get a pay raise today!");
       	 
        }
        else if(rand==2) {
       	 JOptionPane.showMessageDialog(null, "You will get a good grade for your work!");
       	 
        }
        else if(rand==3) {
       	 JOptionPane.showMessageDialog(null, "You are doing great!");
       	 
        }
        else if(rand==4) {
       	 JOptionPane.showMessageDialog(null, "You will get new computers this year!");
       	 
        }
		
	}
 }


