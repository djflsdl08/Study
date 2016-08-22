package pack;

class Rectangle{
	int x1,y1,x2,y2;
	
	Rectangle(){
		x1 = x2 = y1 = y2 = 0;
	}
	Rectangle(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	void set(int x1,int y1,int x2,int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	int square(){
		return (x2-x1)*(y2-y1);
	}
	void show(){
		System.out.print("직사각형의 좌표 : ");
		System.out.println("("+x1+","+y1+")"+"("+x2+","+y2+")");
		System.out.print("직사각형의 넓이 : ");
		System.out.println(square());
	}
	boolean equals(Rectangle r){
		if(this.x1==r.x1&&this.y1==r.y1&&this.x2==r.x2&&this.y2==r.y2)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}
