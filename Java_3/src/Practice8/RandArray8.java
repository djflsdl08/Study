package Practice8;

public class RandArray8 {
	public static void main(String [] args){
		int [][]arr = new int[4][4];
		int x,y;
		int count = 0;
		
		while(count<8){
			x = (int)Math.round(Math.random()*3);	// Randomly selected from 0 to 3
			y = (int)Math.round(Math.random()*3);
			if(arr[x][y]<1||arr[x][y]>10){	// If there is no value stored in the arr[x][y]
				arr[x][y] = (int)Math.round(Math.random()*9+1);
				count++;
			}
			else continue;
		}
		for(int i=0;i<arr.length;i++){	// print of arr
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]<1||arr[i][j]>10)
					arr[i][j] = 0;
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}