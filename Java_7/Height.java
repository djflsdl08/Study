package Vector;
import java.util.Scanner;
import java.util.Vector;

public class Height {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> height = new Vector<Integer>(10);
		Vector<Integer> diff = new Vector<Integer>(9);
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		System.out.print(">> ");
		
		for(int i=0;i<height.capacity();i++) {
			height.add(new Integer(scanner.nextInt()));	
		}
		int max = 0;
		for(int i=0;i<diff.capacity();i++) {
			int sub = height.get(i+1) - height.get(i);
			diff.add(new Integer(sub));
			if(diff.get(max)<diff.get(i))
				max = i;
		}
		double value = diff.get(max);
		System.out.println("가장 키가 많이 자란 년도는 200"+max+"년 "+value+"cm");
		scanner.close();
	}

}
