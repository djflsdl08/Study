package Practice12;

public class Clap {
	public static void main(String[] args){
		for(int i=1;i<100;i++){
			if(i/10==0){	// single-digit
				if(i%3==0)
					System.out.println(i+" Clap");
			}
			else {	//tenth-digit
				int cnt = 0;
				if((i/10)%3==0)
					cnt++;
				if((i%10)%3==0&&i%10!=0)
					cnt++;
				switch(cnt){
				case 1 : System.out.println(i+" Clap"); break;
				case 2 : System.out.println(i+" Clap Clap"); break;
				default : break;
				}
			}
		}
	}
}
