import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Point {
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class PaintApp extends JFrame {
	int x, y;
	Vector<Point> list = new Vector<>();
	
	class SubPanel extends JPanel {
		public SubPanel() {	
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					x = event.getX();
					y = event.getY();
					list.add(new Point(x, y));
					repaint();
				}
			});
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		for(Point p : list) {
			g.fillOval(p.x, p.y, 4, 4);
		}
	}
	public PaintApp() {
		setSize(600, 400);
		setTitle("nai");
		setVisible(true);
		add(new SubPanel());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaintApp  pa = new PaintApp(); 
	}

}
