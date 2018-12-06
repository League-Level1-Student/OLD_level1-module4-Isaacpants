package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NO_U implements ActionListener {
	JButton jb = new JButton();

public static void main(String[] args) {
	NO_U nu = new NO_U();
	nu.setup();
	}void setup(){
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jb.addActionListener(this);
		jf.setVisible(true);
		jf.add(jp);
		jp.add(jb);
		jb.setText("click this!");
		jf.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
if(jb==pressed){
			JOptionPane.showMessageDialog(null, "no u");
			
			
		}
	}
	}

