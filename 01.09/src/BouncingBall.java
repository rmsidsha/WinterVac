import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BouncingBall extends JFrame implements ActionListener{
	int x, y;   //x, y
	private int xSpeed =0, ySpeed = 0; // if 0 that stop
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private static final int PERIOD = 50;   //set speed 
	
	class SubPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.fillOval(x, y, 40, 40);
		}
	}
	public void update() {
		x+= xSpeed;
		y+= ySpeed;
		if (x>WIDTH -40 || x<0) {
			xSpeed = -xSpeed;
		}
		if (y>HEIGHT -40 || y<0 ) {
			ySpeed = -ySpeed;
		}
	}
	public BouncingBall() {
		setSize(600, 400);
		setVisible(true);
		add(new SubPanel());
		Timer t = new Timer(PERIOD, this);
		t.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BouncingBall bb = new BouncingBall();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
		repaint();
	}

}
