import java.util.*;

public class ccc09s1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for (int i = a; i <= b; i++){
			int n = i;
			if (Math.sqrt(n) == (int)(Math.sqrt(n)) && Math.cbrt(n) == (int)(Math.cbrt(n))){
				count++;
				i++;
			}
		}
		
		System.out.println(count);
		
	}

}
