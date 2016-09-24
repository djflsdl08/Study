package Prac4;
import java.util.Scanner;

class Player {	// 선수를 표현하는 클래스
	private String name;
	Player(String name){	//매개변수를 갖는 생성자
		this.name = name;
	}
	String getName() {
		return name;
	}
}
public class GamblingGame {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		Player [] p = new Player[2];	// 선수 배열 선언
		for(int i=0;i<p.length;i++){
			System.out.print("선수 이름 입력 >> ");
			p[i] = new Player(scanner.next());	// 선수 객체 생성		
		}
		int n = 0;	// 배열p의 인덱스
		while(true){
			System.out.print(p[n].getName()+" <Enter 외 아무키나 치세요>");
			scanner.next();  // 단순히 읽고 버림
			int [] val = new int[3];  // 랜덤한 수를 저장할 정수 배열 생성
			for(int i=0;i<val.length;i++){
				val[i] = (int)(Math.random()*3);  //0~2 사이의 수 랜덤 발생
				System.out.print(val[i]+"\t");
			}
			System.out.println();
			if(val[0]==val[1]&&val[1]==val[2]){  // 3개의 정수가 모두 같으면
				System.out.println(p[n].getName()+"이 승리하였습니다.");
				break;  // 반복문 벗어남
			}
			n++;
			n %=2;  // 선수를 표현하는 수 이므로 0,1이 반복되도록
		}
		scanner.close();
	}
}