import java.util.*;
import java.io.*;

public class p183ex7 {
	
	public static boolean isPrime(int n) {
		for (int i=2; i<=(int)Math.ceil(Math.sqrt(n)); i++) {
			if (n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = sc.nextInt();
		
		if (n==1) System.out.println(0);
		else {
			System.out.println(0+"\n"+1);
			
			for (int i=3; i<=n; i++) {
				if (isPrime(i)) System.out.println(1);
				else System.out.println(0);
			}
		}
		
		

	}
}
