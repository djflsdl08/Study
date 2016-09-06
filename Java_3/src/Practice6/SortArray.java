package Practice6;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		
		for(int i=0;i<intArray.length;i++){
			intArray[i] = scanner.nextInt();
		}

		//sorting
		for(int i=0;i<(intArray.length-1);i++){
			for(int j=i+1;j<intArray.length;j++){
				if(intArray[i]>intArray[j]){
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		
		//print
		for(int k:intArray){
			System.out.print(k + " ");
		}
		scanner.close();
	}
}
