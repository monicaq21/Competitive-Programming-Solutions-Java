import java.util.*;

public class p108ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			if (a >= 0 && a <= 30) System.out.println(38);
			else if (a <= 50) System.out.println(55);
			else if (a <= 100) System.out.println(73);
			else if (a > 100) System.out.println((int) (73 + 24 * Math.ceil((a - 100) / 50.0)) );
			
		}

	}
}
