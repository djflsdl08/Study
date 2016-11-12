import java.io.*;
import java.util.*;

public class File {
	
	public static void main(String[] args) {
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		BufferedReader in = null;
		Scanner scanner = new Scanner(System.in);
		int count,check;
		boolean change;
		char yn;
		
		try {
			do {
				count = 0; check = 0;
				FileReader filename = new FileReader("/Users/gim-yejin/Desktop/SwingTest/src/abc.txt");
				// OS X 에선 /로! Windows 에선 \\로!
				in = new BufferedReader(filename);
				int x = (int)(Math.random()*20);	// x번째 단어 선택
				for(int i=0;i<x-1;i++)
					in.readLine();
				String str = in.readLine();		// 선택된 단어
			
				int a = (int)(Math.random()*(str.length()-1));	// 0~(str의 길이-1) 사이의 난수 발생
				int b;
				do
					b = (int)(Math.random()*(str.length()-1));	// 두개의 글자 숨기기(a!=b)
				while(a==b);
			
				do {
					for(int i=0;i<str.length();i++) {		// 두 글자만 숨겨서 출력 
						if(i==a||i==b)
							System.out.print("_");
						else System.out.print(str.charAt(i));
					}
					if(check!=1)
						System.out.print("\n>> ");
					else break;
					char user = scanner.next().charAt(0);
				
					change = false;
					if(a!=str.length()) {
						if(user==str.charAt(a)) {
							a = str.length();
							change = true;
						}
					}
					if(b!=str.length()) {
						if(user==str.charAt(b)) {
							b = str.length();
							change = true;
						}	
					}
					if(a==str.length()&&b==str.length())
						check++;
					if(change==false) 
						count++;
					if(count==5) {
						System.out.println("5번 틀렸습니다.");
						System.out.println("정답 : "+str);
						break;
					}
				}while(true);
				
				System.out.println("");
				System.out.print("Next(y/n)? >> ");
				yn = scanner.next().charAt(0);
			}while(yn=='y'||yn=='Y');
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		scanner.close();
	}
}