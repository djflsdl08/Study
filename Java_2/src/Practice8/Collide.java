package Chap2;
import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x1,x2,y1,y2;
		System.out.print("두 점 (x1,y1),(x2,y2)의 좌표를 입력하시오.>> ");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		// 두 점 중 적어도 한 점이 사각형 내부에 있는 경우
		if((x1>=50&&x1<=100)&&(y1>=50&&y1<=100)||(x2>=50&&x2<=100)&&(y2>=50&&y2<=100)){
			System.out.println("사각형이 겹칩니다.");
		}
		// 사각형을 덮을 때
		else if((x1<50&&y1<50||x1>100&&y1>100)&&(x2<50&&y2<50||x2>100&&y2>100)){
			System.out.println("사각형이 겹칩니다.");
		}
		else System.out.println("사각형이 겹치지 않습니다.");
		scanner.close();
	}
}