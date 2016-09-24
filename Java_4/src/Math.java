package Prac2;
import java.util.Scanner;

public class Math {
	public static void main(String[] args){
		System.out.print("두 정수와 연산자를 입력하시오. >> ");
		Scanner scanner = new Scanner(System.in);
		Add add = new Add(); // Add 객체생성
		Sub sub = new Sub(); // Sub 객체생성
		Mul mul = new Mul(); // Mul 객체생성
		Div div = new Div(); // Div 객체생성
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char cal = scanner.next().charAt(0);
		
		switch(cal){  // 연산자에 따라 객체를 부른다. 
		case '+' : add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-' : sub.setValue(a, b);
		   System.out.println(sub.calculate());
		   break;
		case '*' : mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case '/' : div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		scanner.close();
	}
}
class Add{ 	// Add 클래스 
	private int a,b; 	// private로 선언
	public void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return (a+b);
	}
} 
class Sub{
	private int a,b;
	public void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return (a-b);
	}
}
class Mul{
	private int a,b;
	public void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return (a*b);
	}
}
class Div{
	private int a,b;
	public void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return (a/b);
	}
}