import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton("SPIN");
	Random r = new Random();

	public static void main(String[] args) {
		SlotMachine ns = new SlotMachine();
		ns.newSlot();
	}

	void newSlot() {
		int reel1 = r.nextInt(3);
		int reel2 = r.nextInt(3);
		int reel3 = r.nextInt(3);
		jf.add(jp);
		jp.add(jb);
		jf.setVisible(true);
		jf.pack();
	}
}
