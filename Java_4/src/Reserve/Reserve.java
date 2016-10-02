package Reserve;
import java.util.Scanner;

public class Reserve {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Seat[] seat = new Seat[3];
		seat[0] = new Seat('S');
		seat[1] = new Seat('A');
		seat[2] = new Seat('B');
	
		while(true){
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
			int menu = scanner.nextInt();
			
			int level;
			switch(menu){
			case 1 : {
				System.out.print("죄석구분 S(1), A(2), B(3) >> ");
				do{
					level = scanner.nextInt();
				}while(level<1||level>3);
				seat[level-1].reserve();
				break;
			}
			case 2 : {
				for(int i=0;i<seat.length;i++)
					seat[i].show();
				System.out.println(" <<< 조회를 완료하였습니다. >>> \n");
				break;
			}
			case 3 : {
				System.out.print("죄석구분 S(1), A(2), B(3) >> ");
				level = scanner.nextInt();
				if(level<1||level>3){
					System.out.println("입력한 좌석 번호가 올바르지 않습니다.");
					break;
				}
				seat[level-1].cancel();
			}
			case 4 : break;
			default : System.out.println("메뉴번호를 다시 입력해주세요.");
			}
			if(menu==4) break;
		}
		//scanner.close();
	}
}