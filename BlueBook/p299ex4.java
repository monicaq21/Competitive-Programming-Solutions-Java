import java.util.*;
import java.io.*;

public class p299ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			
			if (a == 1) System.out.println(0);
			else if (a == 2) System.out.println(1);
			else if (isPrime(a)) System.out.println(1);
			else System.out.println(0);
			
		}
		
	}
	
	public static boolean isPrime(int a) {
		
		for (int i = 2; i <= Math.ceil(Math.sqrt(a)); i++) {
			if (a % i == 0) return false;
		}
		
		return true;
		
	}
}
