import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ActionMouse extends JFrame {
	
	int imgX = 150, imgY = 150;    //Set first image location
   	String imgPath = "C:\\Users\\JaeWon\\Desktop\\DSC06447.jpg";
	public ActionMouse() {
		setTitle("Parctice Action Mouse");
		setSize(600, 400);
		JButton bt = new JButton("");
		ImageIcon image = new ImageIcon(imgPath);
		Image image1 = image.getImage();
		Image getImage = image1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon newImage = new ImageIcon(getImage);
		
		bt.setIcon(newImage);
		bt.setLocation(imgX, imgY);
		JPanel panel = new JPanel();
		
		panel.add(bt);
		panel.requestFocus();
		panel.setFocusable(true);
			 
		panel.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				imgX = e.getX();
				imgY = e.getY();
				bt.setLocation(imgX, imgY);
			}
			public void mouseReleased(MouseEvent e) {
				imgX = e.getX();
				imgY = e.getY();
				bt.setLocation(imgX, imgY);
			}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionMouse am = new ActionMouse();
	}

}
