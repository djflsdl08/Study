package temp;
import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public Phone(String name,String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}
}
class PhoneManager {
	Phone []p;
	Scanner scanner = new Scanner(System.in);
	void read() {
		System.out.print("How many people? >> ");
		int num = scanner.nextInt();
		p = new Phone[num];
		for(int i=0;i<p.length;i++){
			System.out.print("input your name and tel >> ");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name,tel);
		}
		System.out.println("Successfuly Save");
	}
	void run() {
		read();
		while(true){
			System.out.print("Search Name >> ");
			String searchName = scanner.next();
			int check=0;
			if(searchName.equals("exit"))
				break;
			for(int i=0;i<p.length;i++){
				if(p[i].getName().equals(searchName)){
					System.out.println(p[i].getName()+"'s tel is "+p[i].getTel());
					check=1;
				}
			}
			if(check==0)
				System.out.println("not save "+searchName);
		}
	}
	public static void main(String[] args) {
		new PhoneManager().run();
	}
}