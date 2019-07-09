package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	
	static JFrame jf ;
	static JPanel jp ;
	static JLabel jl ;
	static JButton jb;
	static JButton jb1;
	static JButton jb2;
	static JButton jb3;
	static JTextField jtf;
	static JTextField jtf1;
public static void main(String[] args) {
	 jf = new JFrame();
	 jp = new JPanel();
	 jl = new JLabel();
	 jtf = new JTextField();
	 jtf1 = new JTextField();
	 jb = new JButton();
	 jb1 = new JButton();
	 jb2 = new JButton();
	 jb3 = new JButton();
	 
	 jf.setVisible(true);
	 jf.setSize(450, 500);
	 jf.setTitle("Simple Calculator");
	 
	 jtf.setColumns(15);
	 jtf1.setColumns(15);
	 jtf.setSize(100, 50);
	 jtf1.setSize(100, 50);
	 
	 jf.add(jp);
	 jp.add(jtf);
	 jp.add(jtf1);
	 jp.add(jb);
	 jp.add(jb1);
	 jp.add(jb2);
	 jp.add(jb3);
	 

	 
	 jb.setText("add");
	 jb1.setText("sub");
	 jb2.setText("mul");
	 jb3.setText("div");
	 
	 
	 
	 
	 
}public void add() {
	int num = Integer.parseInt(jtf.getText());
	int num1 = Integer.parseInt(jtf1.getText());
	int num2 = num+num1;
	
	jl.setText(""+num2);
}public void sub() {
	int num = Integer.parseInt(jtf.getText());
	int num1 = Integer.parseInt(jtf1.getText());
	int num2 = num-num1;
	jl.setText(""+num2);
}public void mul() {
	int num = Integer.parseInt(jtf.getText());
	int num1 = Integer.parseInt(jtf1.getText());
	int num2 = num*num1;
	jl.setText(""+num2);
	
}public void div() {
	int num = Integer.parseInt(jtf.getText());
	int num1 = Integer.parseInt(jtf1.getText());
	int num2 = num/num1;
	jl.setText(""+num2);
	
}



}
