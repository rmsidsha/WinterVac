import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameEventTest extends JFrame{
	private JButton button;
	private JLabel label;
	int counter=0;
	
		public JFrameEventTest() {
			this.setSize(400, 150);
			this.setTitle("�̺�Ʈ ����");
			JPanel panel = new JPanel(); 
			button = new JButton("����");
			label = new JLabel("������ ī���Ͱ�:  "+counter);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					counter++;
					label.setText("������ ī���Ͱ�:  "+counter);
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
