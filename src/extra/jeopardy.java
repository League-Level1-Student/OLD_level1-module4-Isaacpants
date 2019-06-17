package extra;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jeopardy {
	
public static void main(String[] args) {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	JButton jb=new JButton();
	JButton jb1=new JButton();
	JButton jb2=new JButton();
	int score =0;
	
	
	
	
	jf.setVisible(true);
	jf.setTitle("food");
	jf.add(jp);
	
	jl.setText("score = "+ score);
	jl.setPreferredSize(new Dimension(800,50));
	
	jp.add(jl);
	jp.add(jb);
	jp.add(jb1);
	jp.add(jb2);
	jp.setLayout(new GridLayout(4,1));
	
	
	
	
	jb.setVisible(true);
	jb.setText("100");
	jb.setPreferredSize(new Dimension(800,200));
	
	jb1.setVisible(true);
	jb1.setText("300");
	jb1.setPreferredSize(new Dimension(800,200));
	
	jb2.setVisible(true);
	jb2.setText("500");
	jb2.setPreferredSize(new Dimension(800,200));
	
	jf.pack();
}
}
