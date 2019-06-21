package extra;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame jf= new JFrame();
	JLabel jl = new JLabel();
	JPanel jp = new JPanel();
	char currentLetter;
	
	TypingTutor(){
	
	
	
	jf.setVisible(true);
	jf.setTitle("Type or Die");
	jp.add(jl);
	jf.add(jp);
	jf.addKeyListener(this);
	
	
	jl.setFont(jl.getFont().deriveFont(28.0f));
	jl.setHorizontalAlignment(JLabel.CENTER);
	
	
	
	currentLetter = generateRandomLetter();
	jl.setText(""+currentLetter);
	jf.pack();
}
	
	
	
	
	public static void main(String[] args) {
	TypingTutor t = new TypingTutor();

	
	}char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	
}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
		
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("you typed : "+e.getKeyChar());
		
	
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(""+currentLetter);
		System.out.println(""+e.getKeyChar());
if(e.getKeyChar()==currentLetter) {
			System.out.println("u r correct");
			jp.setBackground(Color.green);
		}else {
			
			jp.setBackground(Color.red);
		}
		currentLetter = generateRandomLetter();

		jl.setText(""+currentLetter);
		

		
	}
}
