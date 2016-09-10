package Chap2;
import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x1,x2,y1,y2;
		System.out.print("Please enter the coordinates of two points (x1,y1),(x2,y2).>> ");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		// If there inside a rectangle of at least one point of the two points.
		if((x1>=50&&x1<=100)&&(y1>=50&&y1<=100)||(x2>=50&&x2<=100)&&(y2>=50&&y2<=100)){
			System.out.println("Rectangle overlap.");
		}
		// When covering a square
		else if((x1<50&&y1<50&&x2>100&&y2>100)||(x1>100&&y1>100)&&(x2<50&&y2<50)){
			System.out.println("Rectangle overlap.");
		}
		else System.out.println("Rectangle do not overlap.");
		scanner.close();
	}
}