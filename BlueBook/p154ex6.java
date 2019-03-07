import java.util.*;

public class p154ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double p = sc.nextDouble() / 100.0 + 1, a = sc.nextDouble(), y = sc.nextDouble(), b = sc.nextDouble();
		
		double n = Math.log(b/a) / Math.log(p);
		System.out.println((int)Math.ceil(n+y));

	}
}
