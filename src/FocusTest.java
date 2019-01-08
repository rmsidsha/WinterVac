import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class FocusTest extends JFrame{
	int n1, n2, n3;
	JButton bt1, bt2, bt3;
	
	public FocusTest() {
		setTitle("간단한 게임");
		setSize(400, 150);
		
		JPanel jp = new JPanel();
		bt1 = new JButton(""+n1);
		jp.add(bt1);
		bt2 = new JButton(""+n2);
		jp.add(bt2);
		bt3 = new JButton(""+n3);
		jp.add(bt3);
		jp.requestFocus();
		jp.setFocusable(true);

jp.addKeyListener(new KeyListener() {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(keyCode==KeyEvent.VK_ENTER) {
			n1 = (int)(Math.random()*10);
			n2 = (int)(Math.random()*10);
			n3 = (int)(Math.random()*10);
			bt1.setText(""+n1);
			bt2.setText(""+n2);
			bt3.setText(""+n3);
		}
		else if (keyCode == KeyEvent.VK_1) {
			n1 = (int)(Math.random()*100);
			n2 = (int)(Math.random()*100);
			n3 = (int)(Math.random()*100);
			bt1.setText(""+n1);
			bt2.setText(""+n2);
			bt3.setText(""+n3);
		}
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
});
		add(jp);
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocusTest ft = new FocusTest();
	}

}
