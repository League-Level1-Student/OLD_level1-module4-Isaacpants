package extra2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user
 * clicks on an illusion, a new one will be loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame jf = new JFrame();

	public void run() {
		// 2. make the frame visible
		jf.setVisible(true);
		// 3. set the size of the frame
		jf.setSize(1000, 1000);
		// 4. find 2 images and save them to your project’s default package
		// done

		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String pic = "cherry.jpg";
		String pic1 = "watermelon.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel jl;
		JLabel jl1;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		jl = loadImageFromComputer("cherry.jpg");
		jl1 = loadImageFromComputer("watermelon.jpg");
		// 8. add your JLabel to the frame
		jf.add(jl);
		// 9. call the pack() method on the frame
		jf.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		jf.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		jf.remove(jf);
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
		jf.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under
	 * "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
