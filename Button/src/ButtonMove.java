import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Moving buttons
 */
public class ButtonMove extends JFrame {

	/** */
	private static final long serialVersionUID = 1L;
	Random random = new Random();
	/**
	 * Button that moves when clicked
	 */
	JButton button1;
	/**
	 * Button that moves when touched
	 */
	JButton button2;
	/**
	 * X coordinate of button
	 */
	int x = 400;
	/**
	 * Y coordinate of button
	 */
	int y = 400;
	/**
	 * Width of button
	 */
	int width = 100;
	/**
	 * Height of button
	 */
	int height = 100;
	
	ButtonMove() {
		setSize(new Dimension(2000, 800));
		setLayout(new FlowLayout());
		button1 = new JButton();
		button2 = new JButton();
		createButton();
	}

	private void createButton() {
		Listener listener = new Listener();
		button1.setText("Click");
		button1.addActionListener(listener);
		add(button1);
		button2.setText("Touch");
		button2.addMouseMotionListener(listener);
		add(button2);
	}
	
	class Listener implements ActionListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			button2.setBounds(x, y, width, height);
			x = random.nextInt(800);
			y = random.nextInt(800);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			button1.setBounds(x, y, width, height);
			x = random.nextInt(800);
			y = random.nextInt(800);
		}
		
	}

}
