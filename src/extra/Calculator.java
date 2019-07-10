package extra;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	
	
	 JFrame jf = new JFrame();
	 JPanel jp = new JPanel();
	 JLabel jl = new JLabel();
	 JButton jb= new JButton();
	 JButton jb1= new JButton();
	 JButton jb2= new JButton();
	 JButton jb3= new JButton();
	 JTextField jtf= new JTextField();
	 JTextField jtf1= new JTextField();
	
	
	 public void setup() {
	
 jb.addActionListener(this);
	 
	 
	 jb1.addActionListener(this);
	 

	 jb2.addActionListener(this);
	 

	 jb3.addActionListener(this);
	 
	 jf.setVisible(true);
	 jf.setSize(450, 500);
	 jf.setTitle("Simple Calculator");
	 
	 jtf.setColumns(15);
	 jtf1.setColumns(15);
	 jtf.setSize(100, 50);
	 jtf1.setSize(100, 50);
jl.setPreferredSize(new Dimension(50,50));
	 jl.setFont(new Font("Serif", Font.BOLD, 50));
	 
	 jf.add(jp);
	 jp.add(jtf);
	 jp.add(jtf1);
	 jp.add(jb);
	 jp.add(jb1);
	 jp.add(jb2);
	 jp.add(jb3);
	 jp.add(jl);
	 
	
	 
	 

	 
	 jb.setText("add");
	 jb.addActionListener(this);
	 
	 jb1.setText("sub");
	 jb1.addActionListener(this);
	 
	 jb2.setText("mul");
	 jb2.addActionListener(this);
	 
	 jb3.setText("div");
	 jb3.addActionListener(this);
	 
	 
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.setup();
	
	 

	 

	 
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==jb) {
		add();
	}if(e.getSource()==jb1) {
		sub();
	}if(e.getSource()==jb2) {
		mul();
	}if(e.getSource()==jb3) {
		div();
	}
	
}



}
