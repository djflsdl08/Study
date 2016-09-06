package Practice5;
import java.util.Scanner;

public class IntArray {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
	
		for(int i=0;i<intArray.length;i++){
			intArray[i] = scanner.nextInt();
		}
		
		for(int k:intArray){
			if(k%3==0)
				System.out.print(k+" ");
		}
		scanner.close();
	}
}
