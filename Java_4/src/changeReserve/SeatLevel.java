package Reserve;
import java.util.Scanner;

public class SeatLevel {
	private char type;
	private Seat[] seat;
	
	SeatLevel(char type){
		this.type = type;
		seat = new Seat[10];
		for(int i=0;i<seat.length;i++)
			seat[i] = new Seat();
	}
	
	public void show(){
		System.out.print(type+" >> ");
		for(int i=0;i<seat.length;i++){
			if(seat[i].isIn())
				System.out.print(seat[i].getName()+" ");
			else System.out.print("---"+ " ");
		}
		System.out.println();
	}
	
	public boolean getisIn(int num){
		if(seat[num-1].isIn())
			return true;
		else return false;
	}
	
	public void book(int n,String name){
		seat[n-1].book(name);
	}
	
	public void seatCancel(Scanner scanner,String name){
		for(int i=0;i<seat.length;i++)
			if(seat[i].equal(name))
				seat[i].cancel();
	}
}