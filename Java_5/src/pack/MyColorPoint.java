package pack;

abstract class MyPoint {
	int x,y;
	
	public MyPoint(int x,int y){
		this.x = x; this.y = y;
	}
	protected abstract void move(int x,int y);
	protected abstract void reverse();
	protected void show(){
		System.out.print(x+","+y);
	}
}
public class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int x,int y,String color){
		super(x,y);
		this.color = color;
	}
	protected void move(int x,int y){
		this.x = x;
		this.y = y;
	}
	protected void reverse(){
		int tmp = this.x;
		this.x = this.y;
		this.y = tmp;
	}
	protected void show(){
		super.show();
		System.out.println(","+color);
	}
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}
}
