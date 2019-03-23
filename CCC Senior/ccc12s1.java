import java.util.*;

public class ccc12s1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n < 4){
			System.out.println(0);
		} else if (n == 4){
			System.out.println(1);
		} else if (n == 5){
			System.out.println(5);
		} else if (n == 6){
			System.out.println(15);
		} else if (n == 7){
			System.out.println(20);
		} else {
			System.out.println(factorial(n));
		}
	}
	
	public static int factorial (int a){
		int x = 1;
		for (int i = a - 1; i >= a - 3; i--){
			x *= i;
		}
		return x / 6;
	}

}
