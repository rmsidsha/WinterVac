import java.awt.*;
import javax.swing.*;

public class FrameTest extends JFrame {
	public FrameTest() {
		setSize(300,150);
		setLocation(200,300);
		setTitle("FrameTest");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.blue);
		JButton button1 = new JButton("Check");
		JButton button2 = new JButton("Cancle");
		this.add(button1);
		this.add(button2);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
	}

}
