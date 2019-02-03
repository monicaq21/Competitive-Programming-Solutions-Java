import java.util.Scanner;

public class ccc06j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), count10 = 0;
		
		for (int i=1; i<=m; i++){
			for (int k=n; k>0; k--){
				if (k+i==10) count10++;
			}
		}
		
		if (count10==1) System.out.println("There is 1 way to get the sum 10.");
		else System.out.println("There are "+count10+" ways to get the sum 10.");
		
	}

}
