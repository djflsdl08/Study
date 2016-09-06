package Practice1;
import java.util.Scanner;

public class Star {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오.>> ");
		int n = scanner.nextInt();
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}