package OpenChallenge;
import java.util.*;
class Phone {
	String address;
	String tel;
	public Phone(String address,String tel) {
		this.address = address;
		this.tel = tel;
	}
}

public class AddressBook {
	HashMap<String,Phone> map = new HashMap<String,Phone>();
	Scanner scanner = new Scanner(System.in);
	Set<String> keys;
	Iterator<String> it;
	public void menu() {
		int n;
		
		do {
			System.out.print("삽입 : 0, 삭제 : 1, 찾기 : 2, 전체보기 : 3, 종료 : 4 >> ");
			n = scanner.nextInt();
			if(n<0||n>4) System.out.println("입력오류! 다시 입력해주세요!");
			keys = map.keySet();
			it = keys.iterator();
			switch(n) {
			case 0: insert();break;
			case 1: remove();break;
			case 2: search();break;
			case 3: view();break;
			case 4: System.out.println("프로그램을 종료합니다.");
			}
		}while(n!=4);
		
		scanner.close();
	}
	
	public void insert() {
		boolean sameName = false;
		
		System.out.print("이름 >> ");
		String name = scanner.next();
		while(it.hasNext()) {
			String key = it.next();
			if(name.equals(key)) {
				System.out.println("동일한 이름이 이미 저장되어 있습니다.");
				sameName = true;
				break;
			}
		}
		if(!sameName){
			System.out.print("주소 >> ");
			String address = scanner.next();
			System.out.print("전화번호 >> ");
			String tel = scanner.next();
			map.put(name, new Phone(address,tel));
		}
	}
	public void remove() {
		boolean remove = false;
		
		System.out.print("삭제하고 싶은 이름은? >> ");
		String name = scanner.next();
		
		while(it.hasNext()) {
			String key = it.next();
			if(name.equals(key)) {
				map.remove(name);
				remove = true;
				System.out.println(name+"은 삭제되었습니다.");
				break;
			}
		}
		if(!remove) {
			System.out.println(name+"은 등록되지 않은 사람입니다.");
		}
	}
	
	public void search() {
		boolean search = false;
		
		System.out.print("찾고 싶은 이름은? >> ");
		String name = scanner.next();
		
		while(it.hasNext()) {
			String key = it.next();
			if(name.equals(key)) {
				Phone value = map.get(key);
				System.out.println(key+" "+value.address+" "+value.tel);
				search = true;
				break;
			}
		}
		if(!search) {
			System.out.println(name+"은 등록되지 않은 사람입니다.");
		}
	}
	
	public void view() {
		while(it.hasNext()) {
			String key = it.next();
			Phone value = map.get(key);
			System.out.println(key +" "+ value.address +" "+ value.tel);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다. ");
		System.out.println("------------------------------------------------");
		
		new AddressBook().menu();
	}

}
