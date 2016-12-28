
public class ConsumerThread extends Thread{
	MyLabel Bar;
	public ConsumerThread(MyLabel Bar) {
		this.Bar = Bar;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(200);
				Bar.consume();
			} catch(InterruptedException e) {return;}
		}
	}
}
