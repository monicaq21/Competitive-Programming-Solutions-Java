import java.util.*;

public class p154ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			if (a % i == 0) System.out.println(i);
		}
		
	}
}
