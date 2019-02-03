import java.util.Arrays;
import java.util.Scanner;

public class ccc07j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] cost = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
		
		int deals = sc.nextInt(), total = 1691600;
		for (int i=0; i<deals; i++){
			int l = sc.nextInt()-1;
			total -= cost[l];
		}
		int N = sc.nextInt();
		double d = (10-deals)/1.0, td = total/d;
		if (N>=td) System.out.println("deal");
		else System.out.println("no deal");



	}

}
