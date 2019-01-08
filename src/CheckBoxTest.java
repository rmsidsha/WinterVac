import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame{
	
	public CheckBoxTest() {
		setTitle("Check box test");
		setSize(600, 400);
		JPanel panel = new JPanel();
		add(panel);
		
		JCheckBox cb1 = new JCheckBox("Apple", true);
		JCheckBox cb2 = new JCheckBox("Banana", true);
		JCheckBox cb3 = new JCheckBox("Grape", true);
		JCheckBox cb4 = new JCheckBox("Orange", true);
		JCheckBox cb5 = new JCheckBox("Pear", true);
		
		JButton submit = new JButton("Submit");
		panel.setBorder(BorderFactory.createTitledBorder("Fruit"));
		
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		panel.add(cb5);
		panel.add(submit);
		
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

}
