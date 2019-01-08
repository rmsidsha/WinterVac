import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameEventTest extends JFrame{
	private JButton button;
	private JLabel label;
	int counter=0;
	
		public JFrameEventTest() {
			this.setSize(400, 150);
			this.setTitle("이벤트 예제");
			JPanel panel = new JPanel(); 
			button = new JButton("증가");
			label = new JLabel("현재의 카운터값:  "+counter);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					counter++;
					label.setText("현재의 카운터값:  "+counter);
				}
			});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrameEventTest et = new JFrameEventTest();
	}
}
