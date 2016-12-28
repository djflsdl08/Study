import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VibFrame extends JFrame {
	MyThread th;
	public VibFrame() {
		super("Vibrating Frame");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		
		JLabel la = new JLabel("Vibration");
		getContentPane().setLayout(null);
		la.setSize(80,30);
		la.setLocation(100,100);
		getContentPane().add(la);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive())
					System.out.println(th.getState().toString());	// Terminated state
				//System.out.println(Thread.currentThread().getName()); 	// This thread is JLabel thread(AWT-EventQueue-0)
				//th.quit();	// This line is quit thread of JLabel not include JFrame
				
				Thread [] tarray = new Thread[Thread.activeCount()];
				Thread.enumerate(tarray);
				for(int i=0;i<tarray.length;i++)
					tarray[i].interrupt();
				// above 3 lines are all thread quit
				
			}
		});
		new MyThread("Vib",this).start();
		th = new MyThread("Label",la);
		th.start();             // native function(make C language)-> JNI(Java Native Interface) => Java + C
										// Android is NDK(Native Development Kit) => Android + C++
										// before this function, this Code is just object.
		
		setVisible(true);		// make Thread
	}
	
	public static void main(String[] args) {
		new VibFrame();
		
		Thread th = Thread.currentThread();
		System.out.println(Thread.activeCount());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getId());
		System.out.println(th.getState().toString());
		
	}
}

class MyThread extends Thread {
	Component target;
	
	public MyThread(String name,Component target) {
		super(name);
		this.target = target;
	}
	public void quit() {
		this.interrupt();		
	}
	public void run() {		// Thread Code (start address of Thread in JVM)
		while(true) {
			int x = target.getX();
			int y = target.getY();
			int dX = (int) Math.floor(Math.random()*20)-10;
			int dY= (int) Math.floor(Math.random()*20)-10;
			
			target.setLocation(x+dX,y+dY);
			try {
				sleep(50);			// scheduling 
			} catch(InterruptedException e) {
				System.out.println("Quit");
				return;
			}
		}
	}
}