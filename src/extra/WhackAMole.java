package extra;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	static JFrame jf ;
	static JPanel jp ;
	static JButton jb;
	static JButton jb2;
public void setup() {
	 jf = new JFrame();
	 jp = new JPanel();
	 jb = new JButton();
	

	jf.setVisible(true);
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
	// TODO Auto-generated method stub
	if(((AbstractButton) e.getSource()).getText()!="mole!") {
		speak("missed");
	}
}
}
