import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class RockPaperScissor extends JFrame implements ActionListener{
	final int ROCK=0;
	final int PAPER=1;
	final int SCISSOR=2;
	
	private JPanel panel;
	private JButton Rock, Paper, Scissor;
	private JLabel output, information;
	
	public RockPaperScissor() {
		setTitle("가위 바위 보 게임");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		information = new JLabel("버튼 하나를 선택 하시오");
		
		output = new JLabel("Good luck");
		Rock = new JButton("0.바위");
		Paper = new JButton("1.보");
		Scissor = new JButton("2.가위");
		
		Rock.addActionListener(this);
		Paper.addActionListener(this);
		Scissor.addActionListener(this);
		
		panel.add(Rock);
		panel.add(Paper);
		panel.add(Scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissor rps = new RockPaperScissor();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		int user = Integer.parseInt(""+ b.getText().charAt(0));
		Random rd = new Random();
		int computer = rd.nextInt(3);
		if(user==computer) {
			output.setText("비김");
		}
		else if(user==(computer+1)%3) {
			output.setText("인간"+user+"  컴퓨터"+computer+" 인간 승");
		}else output.setText("인간"+user+"  컴퓨터"+computer+" computer 승");
		
	}

}
