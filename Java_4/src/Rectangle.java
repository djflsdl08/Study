package Prac1;

public class Rectangle {
	int x1,y1,x2,y2;	// 사각형을 구성하는 두 점의 좌
	
	Rectangle(){		// 디폴트 생성자 (두 점을 원점으로 초기)
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}
	Rectangle(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	void set(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	int square(){
		int x,y;
		
		if(this.x1<this.x2)		// x2 가 더 크면 
			x = (this.x2-this.x1);   // 큰 수에서 작은 수를 뺀 값
		else x = (this.x1-this.x2);
		if(this.y1<this.y2)		//y2 가 더 크면
			y = (this.y2 - this.y1);	// 큰 수에서 작은 수를 뺀 값
		else y = (this.y1 - this.y2);
		// 변수 x와 y는 각각 두 점의 x좌표와 y좌표의 길이이다.
		return (x*y);
	}
	void show(){
		System.out.println("사각형의 좌표");
		System.out.println("x1 = "+this.x1);
		System.out.println("y1 = "+this.y1);
		System.out.println("x2 = "+this.x2);
		System.out.println("y2 = "+this.y2);
		System.out.println("사각형의 넓이 >> "+this.square());
	}
	boolean equals(Rectangle r){
		if(this.x1==r.x1&&this.x2==r.x2&&this.y1==r.y1&&this.y2==r.y2)
			return true;
		// 두 점의 대응되는 각각의 좌표가 모두 같아야 같은 사각형이다
		else return false;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s)){
			System.out.println("두 사각형은 같습니다.");
		}
	}
}