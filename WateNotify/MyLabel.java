import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

class MyLabel extends JLabel {
	private int fillSize = 0;
	private int maxSize;
	public MyLabel(int maxBarSize) {
		this.maxSize = maxBarSize;
		setOpaque(true);
		setBackground(Color.orange);
	}
	
	synchronized public void fill() {
		if(fillSize == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {return;}
		}
		fillSize++;
		repaint();
		notify();
	}
	
	synchronized public void consume() {
		if(fillSize==0) {
			try {
				wait();
			} catch (InterruptedException e) {return;}
		}
		fillSize--;
		repaint();
		notify();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   // MyLabel == JLabel
		g.setColor(Color.magenta);
		if(fillSize==0)
			return;
		int width = (int)((double)this.getWidth()/maxSize)*fillSize;
		g.fillRect(0, 0, width, this.getHeight());
	}
}