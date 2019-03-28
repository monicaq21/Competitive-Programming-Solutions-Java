import java.util.*;

public class p124ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble() / 100.0 + 1, y1 = sc.nextDouble(), p0 = sc.nextDouble(), y2 = sc.nextDouble();
		
		long p = (long) Math.round(p0 * Math.pow(r, y2 - y1));
		
		System.out.println(p);
		
	}
}
