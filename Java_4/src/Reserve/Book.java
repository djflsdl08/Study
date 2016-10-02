package Reserve;

public class Book {
	private String name;
	Book(){
		name = null;
	}
	public String getName(){
		return name;
	}
	public void cancel(){
		name = null;
	}
	public void book(String name){
		this.name = name;
	}
	public boolean isIn(){
		if(name == null)
			return false;
		else return true;
	}
	public boolean equal(String name){
		return (name.equals(this.name));
	}
}