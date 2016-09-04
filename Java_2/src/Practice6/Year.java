package Practice6;
import java.util.Scanner;

public class Year {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요. ");
		int year = scanner.nextInt();
		
		if((year%4==0) && (year%100)!=0 || (year%400==0)){
			System.out.print(year + "년은 윤년 입니다.");
		}
		else System.out.print(year + "년은 평년 입니다.");
		
		scanner.close();
	}
}
