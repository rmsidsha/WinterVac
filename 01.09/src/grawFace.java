import java.awt.*;
import javax.swing.*;

public class grawFace extends JFrame{
	class SubPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.white);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(50, 80, 50, 50, 180, -180); //left eye
			g.drawArc(140, 80, 50, 50, 180, -180);  //right eye
			g.drawArc(70, 130, 100, 70, 180, 180);  //mouse
		}
	}
	public grawFace() {
		setSize(300, 300);
		setTitle("Face of Snow Man");
		setVisible(true);
		add(new SubPanel());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grawFace gf = new grawFace();
	}

}
