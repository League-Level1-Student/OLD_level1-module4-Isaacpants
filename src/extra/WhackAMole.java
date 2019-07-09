package extra;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	static JFrame jf ;
	static JPanel jp ;
	static JButton jb;
	static JButton jb2;
	static int whack=0;
	static int whackM=0;
	Date date = new Date();
public void setup() {
	 jf = new JFrame();
	 jp = new JPanel();
	 jb = new JButton();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.setSize(750, 750);
	
	jf.add(jp);
	Random r = new Random();
	int name = r.nextInt(24);
	drawButtons(name);
	
}public void drawButtons(int rand) {
	for (int i = 0; i < 24; i++) {
	jb2 = new JButton();
		jb2.addActionListener(this);
		if(rand==i) {
			jb2.setText("mole!");
			
			jp.add(jb2);
		}else {
		jp.add(jb2);
		}		
	}
	jp.setLayout(new GridLayout(8,3));
}

void speak(String words) {
    try {
        Runtime.getRuntime().exec("say " + words).waitFor();
   } catch (Exception e) {
        e.printStackTrace();
   }
}
@Override
public void actionPerformed(ActionEvent e) {
	Random r = new Random();
	int name = r.nextInt(24);
	
	if(((AbstractButton) e.getSource()).getText()=="mole!") {
		whack++;
		playSound("woohoo.wav");
	jf.dispose();
	new WhackAMole().setup();
	}if(whack>=10) {
		endGame(date,whack);
	}
	
	if(((AbstractButton) e.getSource()).getText()!="mole!") {
		speak("missed");
		jf.dispose();
		new WhackAMole().setup();
		whackM++;
	}
	if(whackM>=5) {
		JOptionPane.showMessageDialog(null, "You Lose");
		System.exit(0);
	}
	
}private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) /100.00 / molesWhacked)
         + " moles per second.");
}private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
