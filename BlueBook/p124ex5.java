import java.util.*;

public class p124ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double a = sc.nextDouble();
			int b = sc.nextInt();
			
			System.out.printf("%.2f", (Math.pow(a, b)));
			System.out.println();
			
		}
		
	}
}
