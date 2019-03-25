import java.util.*;
import java.io.*;

public class ccc18s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		double min = 1<<30;
		
		for (int i = 1; i < n - 1; i++) {
			double left = (a[i] - a[i - 1]) / 2.0;
			double right = (a[i + 1] - a[i]) / 2.0;
			min = Math.min(min, left + right);
		}
		
		System.out.printf("%.1f", min);
		
		
	}
}
