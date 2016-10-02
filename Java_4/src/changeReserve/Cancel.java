package Reserve;
import java.util.Scanner;

public class Cancel {
	public void cancel(SeatLevel seat,Scanner scanner){
		seat.show();
		System.out.print("이름 >> ");
		String name = scanner.next();
		if(name!=null){
			seat.seatCancel(scanner,name);
		}
	}
}