import java.util.*;

public class p156ex13 {
	
	public static boolean isPrime (int number) {
		
		for (int i = 2; i <= (int) Math.ceil( Math.sqrt(number) ); i++) {
			if (number % i == 0) return false;
		}
		
		return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() - 1;
		
		int index = 2;
		
		System.out.print(2 + " ");
		
		int line = 1;
		
		while (n > 0) {
			
			if (isPrime(index)) {
				System.out.print(index + " ");
				n -- ;
				line ++ ;
			}
			
			if (line == 10) {
				System.out.println();
				line = 0;
			}
			
			index ++ ;
		}
		
		System.out.println();
		
	}
}
