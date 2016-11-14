import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setLayout(new FlowLayout());
		JButton jb = new JButton("Open");
		add(jb);
		JButton jb2 = new JButton("Read");
		add(jb2);
		JButton jb3 = new JButton("Close");
		add(jb3);
		setBackground(Color.LIGHT_GRAY);
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		JLabel la = new JLabel("Hello");
		JLabel la2 = new JLabel("Java");
		JLabel la3 = new JLabel("Love");
		int x[] = new int[3];
		int y[] = new int[3];
		for(int i=0;i<3;i++) {
			x[i] = (int)(Math.random()*200)+10;
			y[i] = (int)(Math.random()*200)+10;
		}
		la.setLocation(x[0],y[0]);
		la2.setLocation(x[1],y[1]);
		la3.setLocation(x[2],y[2]);
		la.setSize(50,50);
		la2.setSize(50,50);
		la3.setSize(50,50);
		add(la);add(la2);add(la3);
	}
}

public class Layout extends JFrame {

	public Layout() {
		setSize(300,300);
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		//setLayout(new BorderLayout()); Default of ContentPane is BorderLayout().
		contentPane.add(new NorthPanel(),BorderLayout.NORTH);
		contentPane.add(new CenterPanel(),BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Layout();
	}
}
