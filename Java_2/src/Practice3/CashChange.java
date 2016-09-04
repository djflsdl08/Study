package Practice3;
import java.util.Scanner;

public class CashChange {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요. ");
		int money = scanner.nextInt();
		
		int oMan = money/50000;
		int Man = (money/10000 - oMan*5);
		int Cheon = money%10000/1000;
		int oBac = money%1000/500;
		int Bac = (money%1000%500)/100;
		int oSib = money%1000%500%100/50;
		int Sib = (money%1000%500%100%50)/10;
		
		if(oMan!=0) System.out.println("5만 원권 " + oMan + "매");
		if(Man!=0) System.out.println("만 원권 " + Man + "매");
		if(Cheon!=0) System.out.println("천 원권 " + Cheon + "매");
		if(oBac!=0) System.out.println("500원짜리 동전 " + oBac + "개");
		if(Bac!=0) System.out.println("100원짜리 동전 " + Bac + "개");
		if(oSib!=0) System.out.println("50원짜리 동전 " + oSib + "개");
		if(Sib!=0) System.out.println("10원짜리 동전 " + Sib + "개");
		
		scanner.close();
	}
}
