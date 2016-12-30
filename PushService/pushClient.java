import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.Socket;

public class pushClient extends JFrame implements ActionListener {
	private JTextField serverAddress = new JTextField("");
	private Receiver text = new Receiver();
	private JButton start = new JButton("Start");
	private BufferedReader in = null;
	Socket socket = null;
	
	public pushClient() {
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//c.add(new JLabel("Client"),BorderLayout.NORTH);
		c.add(serverAddress,BorderLayout.NORTH);
		c.add(new JScrollPane(text),BorderLayout.CENTER);
		c.add(start,BorderLayout.SOUTH);
		start.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		setup();
		Thread th = new Thread(text);
		th.start();
		((JButton)(e.getSource())).setEnabled(false);
	}
	
	public void setup() {
		try {
			socket = new Socket("localhost",9995);
			//socket = new Socket(serverAddress.getText(),9995);	// default is 'localhost'
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch(IOException e) {
			handleError(e.getMessage());
		}
	}
	
	private class Receiver extends JTextArea implements Runnable {
		
		@Override
		public void run() {
			while(true) {
				String msg;
				try {
					msg = in.readLine();	// Thread's state is Block state(CPU 소모 X)
					this.append(msg);
				} catch (IOException e) {
					handleError(e.getMessage());
				}
			}
		}
		
	}
	
	public void handleError(String msg) {
		System.out.println(msg);
		try {
			if(socket!=null)
				socket.close();
		} catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new pushClient();
		
	}
}
