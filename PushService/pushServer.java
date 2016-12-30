import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.net.ServerSocket;
import java.net.Socket;

public class pushServer extends JFrame {
	private MyTextField text = new MyTextField(10);
	private JLabel clientCount = new JLabel("0");
	private JLabel deliveredCount = new JLabel("0");
	private JTextArea clientList = new JTextArea(7,40);
	
	public pushServer() {
		setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("text"));
		c.add(text);
		c.add(new JLabel("Client Count"));
		c.add(clientCount);
		c.add(new JLabel("Delivered Number"));
		c.add(deliveredCount);
		c.add(new JScrollPane(clientList));
		setVisible(true);
		
		startService();
	}
	
	private class MyTextField extends JTextField {
		int dcount = 0;
		
		private MyTextField(int size) {
			super(size);
			this.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					put();
					
				}
			});
		}
		
		void increaseDCount() {
			dcount++;
			deliveredCount.setText(Integer.toString(dcount));
		}
		
		void clearDCount() {
			dcount = 0;
			deliveredCount.setText(Integer.toString(dcount));
		}
		
		synchronized public String get() {
			try {
				wait();
				increaseDCount();
			} catch (InterruptedException e) {
				handleError(e.getMessage());
			}
			if(dcount == threadCount) {
				notify();
			}
			return this.getText();
		}
		
		synchronized public void put() {
			if(dcount!=threadCount) {
				try {
					wait();
				} catch(InterruptedException e) {
					handleError(e.getMessage());
				}
			}
			clearDCount();
			notifyAll();
		}
	}

	private void startService() {
		new ServerThread().start();
	}
	
	class ServerThread extends Thread {
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			
			try {
				listener = new ServerSocket(9995);
			} catch(IOException e) {
				handleError(e.getMessage());
			}
			
			while(true) {
				try {
					socket = listener.accept();
					clientList.append("Client Accessed\n");
					ServiceThread th = new ServiceThread(socket);
					clientCount.setText(Integer.toString(threadCount));
					th.start();
				}catch(IOException e) {
					try {
						listener.close();
					} catch (IOException e1) {
						handleError(e1.getMessage());
					}
					handleError(e.getMessage());
				}
			}
		}
	}
	

	private int threadCount = 0;
	private class ServiceThread extends Thread {
		Socket socket = null;
		
		public ServiceThread(Socket socket) {
			this.socket = socket;
			threadCount++;
			text.increaseDCount();   // firstTime matching dcount and deliveredCount is same
		}
		
		public void run() {
			BufferedWriter out;
			try {
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				while(true) {
					String msg = text.get();
					out.write(msg+"\n");
					out.flush();
					clientList.append(msg+"\n");
				}
				
			} catch(IOException e) {
				try {
					socket.close();
				}catch(IOException e1) {
					System.out.println(e1.getMessage());
					return;
				}
				handleError(e.getMessage());
				return;
			}
			
		}
	}
	
	public void handleError(String msg) {
		System.out.println(msg);
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new pushServer();

	}

}
