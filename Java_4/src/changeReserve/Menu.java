package Reserve;
import java.util.Scanner;

public class Menu {
	public void run(){
		Scanner scanner = new Scanner(System.in);
		SeatLevel[] seat = new SeatLevel[3];
		seat[0] = new SeatLevel('S');
		seat[1] = new SeatLevel('A');
		seat[2] = new SeatLevel('B');
		Reserve reserve = new Reserve();
		Cancel cancel = new Cancel();
		Show show = new Show();
		
		while(true){
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
			int menu = scanner.nextInt();
			int level;
			switch(menu){
			case 1:{
				level = reserve.whatLevel(scanner);
				reserve.reserve(seat[level-1],scanner);
				break;
			}
			case 2:{
				show.show(seat);break;
			}
			case 3:{
				level = reserve.whatLevel(scanner);
				cancel.cancel(seat[level-1],scanner);
				break;
			}
			case 4: System.out.print("공연 예약 시스템 종료");break;
			default : System.out.println("메뉴번호를 다시 입력해주세요. ");
			}
			if(menu==4) break;
		}
	}
}