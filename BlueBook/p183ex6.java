import java.util.*;
import java.io.*;

public class p183ex6 {
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int) Math.ceil(Math.sqrt(n)); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int l = 0; l <= i; l++) {
				
				if (l == 0 || l == i) {
					a[i][l] = 1;
				} else {
					a[i][l] = a[i - 1][l - 1] + a[i - 1][l];
				}
				System.out.print(a[i][l]+" ");
				
			}
			
			System.out.println();
			
		}
		

	}
}
