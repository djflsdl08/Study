package Practice7;

public class RandomArray {
	public static void main(String [] args){
		int intArray[][] = new int[4][4];
		
		for(int i=0;i<intArray.length;i++){
			for(int j=0;j<intArray[i].length;j++){
				intArray[i][j] = (int)Math.round(Math.random()*9+1);
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
