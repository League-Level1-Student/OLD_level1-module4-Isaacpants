import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton("SPIN");
	Random r = new Random();

	public static void main(String[] args) {
		SlotMachine ns = new SlotMachine();
		ns.newSlot();

	}

	void newSlot() {
		int r1 = r.nextInt(3);
		int r2 = r.nextInt(3);
		int r3 = r.nextInt(3);
		jf.add(jp);
		jp.add(jb);
		try {
			createLabelImage("orange.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jb.setText("SPIN!");
		jb.addActionListener(this);
		jf.setVisible(true);
		jf.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {

		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon("orange.jpeg");
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}
