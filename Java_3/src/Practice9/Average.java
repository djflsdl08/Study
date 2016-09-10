package Practice9;

public class Average {
	public static void main(String [] args){
		double sum = 0.0;
		for(int i=0;i<args.length;i++){
			sum += Integer.parseInt(args[i]);	// Run menu -> Run Configurations menu -> (x)=Arguments -> input
		}
		System.out.print("Average is " + (double)sum/args.length);
	}
}