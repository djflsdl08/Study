package Practice7;
import java.util.Scanner;

public class InsideRectangle {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오.>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x>50&&x<100)&&(y>50&&y<100))
			System.out.print("사각형 안에 점이 있습니다.");
		else System.out.print("사각형 밖에 점이 있습니다.");
		
		scanner.close();
	}
}