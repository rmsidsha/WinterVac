
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

class CreateCalClass extends JFrame{
	private JPanel panel;
	private JButton [] buttons;
	private JTextField jt;
	
	private String [] labels = {"Backspace", "", "", "CE", "C","7","8","9", "/", "sqrt", "4,", "5",
								"6", "x", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="};
		public CreateCalClass() {
			jt = new JTextField(35);
			panel = new JPanel();	
			jt.setText("0");
			jt.setEnabled(false);
			
			panel.setLayout(new GridLayout(0, 5, 3, 3));
			buttons = new JButton[25];
			int index =0;
			for(int rows = 0; rows<5; rows++) {
				for(int cols =0; cols<5; cols++) {
					buttons[index] = new JButton(labels[index]);
					if(cols>=3) {
						buttons[index].setForeground(Color.RED); 
					}else {
						buttons[index].setForeground(Color.YELLOW);
						panel.add(buttons[index]);
						index++;
					}
					panel.add(buttons[index]);
					index++;
				}
			}
			add(jt, BorderLayout.NORTH);
			add(jt, BorderLayout.CENTER);
			setVisible(true);
			pack();
	}
}
		public class CreateCal{
		public static void main(String[] args) {
			CreateCalClass cc = new CreateCalClass();
		}
}

