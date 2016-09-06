package Practice4;
import java.util.Scanner;

public class GCD {
	static int min(int a,int b){
		if(a<b) return a;
		else return b;
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 수를 입력하세요.>> ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int common = 0;
		for(int i=2;i<=min(n,m);i++){
			if(n%i == 0){
				if(m%i == 0)
					common = i;
			}
		}
		System.out.print("최대 공약수는 "+common + "입니다.");
		scanner.close();
	}
}