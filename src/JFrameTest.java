import javax.swing.*;
import java.awt.*;

public class JFrameTest extends JFrame{
	public JFrameTest() {
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("ȭ�� �µ�");
		JLabel lb2 = new JLabel("���� �µ�");
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		JButton bt = new JButton("��ȯ");
		
		p.add(lb);
		p.add(f1);
		p.add(lb2);
		p.add(f2);
		p.add(bt);
		
		setSize(300, 150);
		setTitle("�µ���ȯ��");
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JFrameTest ft = new JFrameTest();
	}
		
	}


