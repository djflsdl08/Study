import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyLabel Bar = new MyLabel(100);
	
	public MyFrame() {
		setSize(400,100);
		setLocation(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		Bar.setSize(300,20);
		Bar.setLocation(50,25);
		c.add(Bar);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Bar.fill();
			}
		});
		setVisible(true);
		new ConsumerThread(Bar).start();
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}