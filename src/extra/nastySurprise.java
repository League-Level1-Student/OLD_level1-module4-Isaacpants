package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	nastySurprise(){
	
		
		
		jf.setVisible(true);
		jf.add(jp);
		
		
		jp.add(jb);
		jp.add(jb1);
		
		
		jb.setText("trick");
		jb1.setText("treat");
		jb.addActionListener(this);
		jb1.addActionListener(this);

		
		
		jf.pack();
	}
	
	public static void main(String[] args) {

		
		nastySurprise n = new nastySurprise();
		
		
		
	
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb1) {
			showPictureFromTheInternet("https://www.thelabradorsite.com/wp-content/uploads/2019/03/Cute-puppy-Names-Over-200-Adorable-Ideas-LS-long.jpg");
		
		}
		if (e.getSource() == jb) {
			showPictureFromTheInternet("https://image.shutterstock.com/image-illustration/3d-illustration-scary-ghost-woman-260nw-699737932.jpg");
		}
	}
}
