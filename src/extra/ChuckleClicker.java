package extra;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JButton jb5 = new JButton();
	public static void main(String[] args) {
		ChuckleClicker mb = new ChuckleClicker();
		mb.makeButtons();

	}

	void makeButtons() {

		jf.add(jp);
		jp.add(jb);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.setLayout(new GridLayout(3,3));
		jb.setText("joke");
		jb1.setText("punchline");
		jb2.setText("joke");
		jb3.setText("punchline");
		jb4.setText("joke");
		jb5.setText("punchline");
		jf.setVisible(true);
		jf.pack();
		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb) {
			JOptionPane.showMessageDialog(null, "What’s the best part about living in Switzerland?");
		} if (e.getSource() == jb1) {
			JOptionPane.showMessageDialog(null, "I don't know but the flag is a big plus");

		}
		
		if (e.getSource() == jb2) {
			JOptionPane.showMessageDialog(null, "what did the traffic light say to the car?");
		} if (e.getSource() == jb3) {
			JOptionPane.showMessageDialog(null, "Dont look im about to change");

		}if (e.getSource() == jb4) {
			JOptionPane.showMessageDialog(null, "What did the termite say when he entered the bar?");
		} if (e.getSource() == jb5) {
			JOptionPane.showMessageDialog(null, "is the bar tender here");

		}
		

	}
}
