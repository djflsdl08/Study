package Practice2;
import java.util.Scanner;

public class Alphabet {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요.>> ");
		char ch = scanner.next().charAt(0);
		
		for(int i=0;i<=(int)(ch-'a');i++){
			for(char c='a';c<=(char)(ch-i);c++){
				System.out.print(c);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}