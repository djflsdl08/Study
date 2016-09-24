package Prac3;
import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public String getName(){
		return name;
	}
	public String getTel(){
		return tel;
	}
	public static void main(String [] args){
		Phone[] phone = new Phone[2];	// 크기가 2인 배열 선언
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<phone.length;i++){  // 배열의 크기만큼 반복
			System.out.print("이름과 전화번호 입력 >> ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name,tel);  // 배열의 index마다 객체생성
		}
		for(int i=0;i<phone.length;i++){
			System.out.println(phone[i].getName()+"의 번호 "+phone[i].getTel());
		}
		scanner.close();
	}
}