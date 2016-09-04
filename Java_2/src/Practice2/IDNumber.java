package Practice2;
import java.util.Scanner;

public class IDNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Scanner a = scanner.useDelimiter("\\s|-");
		String ch = a.next();
	
		System.out.print("주민번호 앞자리는 " + ch);

		scanner.close();
	}
}
