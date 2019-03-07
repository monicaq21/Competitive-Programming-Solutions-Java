import java.util.*;

public class p118ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double max = -1<<30;
		double[] a = new double[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextDouble();
			if (a[i]>max) {
				max = a[i];
			}
		}
		
		for (double i: a) {
			if (i==max) continue;
			System.out.printf("%.2f",i);
			System.out.println();
		}
		
		System.out.printf("%.2f",max);
		System.out.println();
		
	}
}
