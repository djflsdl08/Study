import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300,300);
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int twenty = 20;
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		while(true) {
			twenty--;
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			JLabel label = new JLabel();
			label.setSize(10,10);
			label.setLocation(x,y);
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			contentPane.add(label);
			if(twenty==0) break;
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}/*
class CenterFrame extends JPanel {
	public CenterFrame() {
		setLayout(null);
		int x = (int)(Math.random()*200)+50;
		int y = (int)(Math.random()*200)+50;
		JLabel label = new JLabel();
		label.setSize(10,10);
		label.setLocation(x,y);
		label.setOpaque(true);
		label.setBackground(Color.BLUE);
		add(label);
	}
}
public class MyFrame extends JFrame {
	public MyFrame() {
		int num=20;
		setSize(300,300);
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		while(true){
			num--;
			contentPane.add(new CenterFrame());
			if(num==0) break;
		}
		setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
	}
}*/