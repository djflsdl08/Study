
import java.util.Scanner;

class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.print(name + ">> ");
	}
	
	public String getName() {
		return name;
	}
}

public class OpenChallenge {
	
	public static void main(String[] args) {
		
		System.out.print("How many people participate in this game? >> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Player players[] = new Player [n];
		
		for(int i=0;i<n;i++) {
			System.out.print("What is the name of participant? >> ");
			String name = sc.next();
			players[i] = new Player(name);
		}
		
		System.out.println("The first word is 'Father' .");
		
		boolean check = false;
		int lastIndex;
		char lastChar = 'r';
		char firstChar;
		int count = 0;

		do {
			
			players[count].print();
			if (count >= players.length-1) {
				count = 0;
			} else {
				count++;
			}
			String word = sc.next();
			firstChar = word.charAt(0);
			if(lastChar == firstChar) {
				check = true;
				lastIndex = word.length() - 1;
				lastChar = word.charAt(lastIndex);
			} else {
				if(count == 0) {
					count = players.length-1;
				} else {
					count -= 1;
				}
				System.out.print(players[count].getName()+" is lose.");
				check = false;
			}
					
		}while(check);
		
		sc.close();
	}
}
