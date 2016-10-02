package Reserve;
import java.util.Scanner;

public class Reserve {
	public int whatLevel(Scanner scanner){
		int level;
		System.out.print("죄석구분 S(1), A(2), B(3) >> ");
		while(true){
			level = scanner.nextInt();
			if(level>=1&&level<=3) break;
			System.out.print("좌석구분 번호를 정확하게 입력하세요. ");
		}
		return level;
	}
	
	public void reserve(SeatLevel seat,Scanner scanner){
		seat.show();
		System.out.print("이름 >> ");
		String name = scanner.next();
		int seatNum;
		while(true){
			System.out.print("번호 >> ");
			seatNum = scanner.nextInt();
			if((seatNum>0&&seatNum<11)&&!seat.getisIn(seatNum)) break;
		}
		seat.book(seatNum,name);
	}
}