import java.util.Scanner;

public class p171ex6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		double m = Integer.MIN_VALUE;
		for (int i=0; i<a; i++){
			double j = sc.nextDouble();
			if (j>m){
				m = j;
			}
		}
		
		System.out.printf("%.4f",m);
		
	}
}
