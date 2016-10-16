import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ArithmeticException
		int divisor = 0;
		int dividend = 0;

		System.out.print("Input dividend >> ");
		dividend = scanner.nextInt();
		System.out.print("Input divisor >> ");
		divisor = scanner.nextInt();
		try {
			System.out.println("quotient is " + dividend/divisor);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}

		// ArrayIndexOutOfBoundsException
		int intArray[] = new int[5];
		
		intArray[0] = 0;
		try {
			for(int i=0;i<intArray.length;i++) {
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"] = " + intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

		// NumberFormatException
		String stringNum[] = {"23","12","998","3.14"};
		
		try {
			for(int i=0;i<stringNum.length;i++) {
				int j = Integer.parseInt(stringNum[i]);
				System.out.print("Number : " + j + "\t");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}

		// NullPointException
		int a[] = null;
		try { 
			a[2] = 4;
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
