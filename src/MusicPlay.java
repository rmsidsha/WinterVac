import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicPlay extends JFrame{
	public MusicPlay() {
		JButton bt = new JButton("play");
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runable() {
					@Override
					public void run() {
						try {
							AudioInputStream ais = 
									AudioSystem.getAudioInputStream(new File("C:\\Users\\JaeWon\\Desktop\\밴드자바자료\\Hello.wav"));
						Clip clip = AudioSystem.getClip();
						clip.open(ais);
						clip.start();
						
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					}
				}).start();
				
			}
		});
		add(bt);
		setSize(300, 300);
		setDefaultCloseOperation(EXID_ON_CLOSE);
		setVisble(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
