package extra;

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

	public static void main(String[] args) {
		ChuckleClicker mb = new ChuckleClicker();
		mb.makeButtons();

	}

	void makeButtons() {

		jf.add(jp);
		jp.add(jb);
		jp.add(jb1);
		jb.setText("joke");
		jb1.setText("punchline");
		jf.setVisible(true);
		jf.pack();
		jb.addActionListener(this);
		jb1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb) {
			JOptionPane.showMessageDialog(null, "What’s the best part about living in Switzerland?");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know but the flag is a big plus");

		}

	}
}
