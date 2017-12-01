import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		char again;
		int start;
		int end;
		int count;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Game Start");
			Random random = new Random();
			again = 'n';
			start= 0;
			end = 99;
			count = 1;
			int answer = random.nextInt(100);
			while(true) {
				System.out.println(start + " ~ " + end);
				System.out.print(count + ">> ");
				count ++;
				int userAnswer = sc.nextInt();
				if(answer == userAnswer) {
					System.out.println("You are right!");
					System.out.println("Do you want to play again? ");
					again = sc.next().charAt(0);
					break;
				} 
				else if(answer > userAnswer) {
					System.out.println("More higher");
					start = userAnswer;
				}
				else {
					System.out.println("More lower");
					end = userAnswer;
				}
			}
		}while(again == 'y');
	}
}
