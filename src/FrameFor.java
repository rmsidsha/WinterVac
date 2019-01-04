import java.awt.*;
import javax.swing.*;

public class FrameFor extends JFrame {
	public FrameFor() {
		setTitle("FrameFor");
		setSize(600, 400);
		setLayout(null);
		
		for(int i =1; i<11; i++) {
			JButton button = new JButton("C"+i);
			button.setOpaque(true);
			button.setLocation(i*60, 100);
			button.setSize(50, 150);
			Color c = new Color(155,10*i,20*i);
			button.setBackground(c);
			add(button);
		}
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameFor ff = new FrameFor();
		
	}

}
