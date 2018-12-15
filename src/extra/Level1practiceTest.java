package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Level1practiceTest {
public static void main(String[] args) {
	JFrame jf=new JFrame();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	JLabel jl = new JLabel();
	JTextField JTF= new JTextField();
	jf.add(jl);
	jf.setVisible(true);
	jl.add(jb);
	jl.add(jb1);
	jb.add(JTF);
	jf.pack();
}
}
