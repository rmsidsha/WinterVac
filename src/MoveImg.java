import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoveImg extends JFrame {
	
	int imgX = 150, imgY = 150;
	String imagePath = "C:\\Users\\JaeWon\\Desktop\\DSC06447.jpg";
	
	public MoveImg() {
		setTitle("Move Image");
		setSize(600, 600);
		JButton bt = new JButton("");
	
		ImageIcon icon = new ImageIcon(imagePath);
		Image getImage = icon.getImage();
		Image changeImage = getImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon getChangeImage = new ImageIcon(changeImage);
		bt.setIcon(getChangeImage);  //Image is over the button
		bt.setLocation(imgX, imgY);
		JPanel panel = new JPanel();
		panel.add(bt);
		panel.requestFocus();
		panel.setFocusable(true);
		
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					imgY-=10;
					break;
				case KeyEvent.VK_DOWN:
					imgY+=10;
					break;
				case KeyEvent.VK_LEFT:
					imgX-=10;
					break;
				case KeyEvent.VK_RIGHT:
					imgX+=10;
					break;
				}
				bt.setLocation(imgX, imgY);
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveImg mi = new MoveImg();
	}

}
