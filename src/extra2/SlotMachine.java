package extra2;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel();
	JButton jb = new JButton("spin");
	
	
public void setup() {
	Random r = new Random();
	int name = r.nextInt(3);
	Random r1 = new Random();
	int name1 = r1.nextInt(3);
	Random r2 = new Random();
	int name2 = r2.nextInt(3);
	
	
	 jf.add(jp);
	 if(name==0) {
		 jp.add(createLabelImage("cherry1.jpg"));
	 }
	 if(name==1) {
		 jp.add(createLabelImage("orange.jpeg"));
	 }
	 if(name==2) {
		 jp.add(createLabelImage("watermelon.jpeg"));
	 }
	 
	 if(name1==0) {
		 jp.add(createLabelImage("cherry1.jpg"));
	 }
	 if(name1==1) {
		 jp.add(createLabelImage("orange.jpeg"));
	 }
	 if(name1==2) {
		 jp.add(createLabelImage("watermelon.jpeg"));
	 }
	 
	 
	 if(name2==0) {
		 jp.add(createLabelImage("cherry1.jpg"));
	 }
	 if(name2==1) {
		 jp.add(createLabelImage("orange.jpeg"));
	 }
	 if(name2==2) {
		 jp.add(createLabelImage("watermelon.jpeg"));
	 }
	 
	 jp.add(jb);
	 //jp.add(jl);
	// jp.add(jl1);
	// jp.add(jl2);
	 jb.addActionListener(this);
	 jf.setVisible(true);
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 jf.setSize(1000,1000);

	 if((name==0 && name1==0 && name2==0)||(name==1 && name1==1 && name2==1)||(name==2 && name1==2 && name2==2)) {
		 JOptionPane.showMessageDialog(null, "You win");
	 }
	 
	 
	 
}private JLabel createLabelImage(String fileName) {
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}



@Override
public void actionPerformed(ActionEvent e) {

	// TODO Auto-generated method stub
	if(e.getSource()==jb) {
		jf.dispose();
		
		jp.removeAll();
		new SlotMachine().setup();
			// TODO Auto-generated catch block
			
			
		
	
	}
}
}
