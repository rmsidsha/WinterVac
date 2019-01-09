import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


public class GraphicTest extends JFrame{
	int x,y;
	class PanelTest extends JPanel{
		 addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.orange);
			g.fillRect(x, y, 100, 100);
		}
	}
	public GraphicTest() {
		setTitle("");
		setSize(600, 400);
		add(new PanelTest());
		setVisible(true);
	}
	
public static void main(String[] args) {
	GraphicTest gt = new GraphicTest();
}
}
