import java.util.*;

public class p129ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double least = Math.ceil(Math.log(n) / Math.log(2));
		
		System.out.println((int)least);
		
	}
}
