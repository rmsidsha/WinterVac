import javax.swing.*;
import java.awt.*;

public class JFrameTest extends JFrame{
	public JFrameTest() {
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("È­¾¾ ¿Âµµ");
		JLabel lb2 = new JLabel("¼·¾¾ ¿Âµµ");
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		JButton bt = new JButton("º¯È¯");
		
		p.add(lb);
		p.add(f1);
		p.add(lb2);
		p.add(f2);
		p.add(bt);
		
		setSize(300, 150);
		setTitle("¿Âµµº¯È¯±â");
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JFrameTest ft = new JFrameTest();
	}
		
	}


