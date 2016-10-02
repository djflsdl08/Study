package Reserve;
import java.util.Scanner;
/* 만약 scanner를 클로즈하면
 *  Exception in thread "main" java.util.NoSuchElementException
 * 라는 에러가 뜬다.
 */
public class Seat {
	private char type;
	private Book[] seat;
	
	Seat(char type){
		this.type = type;
		seat = new Book[10];
		for(int i=0;i<seat.length;i++)
			seat[i] = new Book();
	}
	public void reserve(){
		Scanner scan = new Scanner(System.in);
		show();
		System.out.print("이름 >> ");
		String name = scan.next();
		int seatNum;
		while(true){
			System.out.print("번호 >> ");
			seatNum = scan.nextInt();
			if((seatNum>0&&seatNum<seat.length)&&!seat[seatNum-1].isIn()) break;
		}
		seat[seatNum-1].book(name);
		//scan.close();
	}
	public void cancel(){
		Scanner scan2 = new Scanner(System.in);
		show();
		System.out.print("이름 >> ");
		String name = scan2.next();
		if(name!=null){
			for(int i = 0;i<seat.length;i++){
				if(seat[i].equal(name)){
					seat[i].cancel();
				}
			}
		}
		//scan2.close();
	}
	void show(){
		System.out.print(type+" >> ");
		for(int i=0;i<seat.length;i++){
			if(seat[i].isIn())
				System.out.print(seat[i].getName()+" ");
			else System.out.print("---"+" ");
		}
		System.out.println();
	}
}