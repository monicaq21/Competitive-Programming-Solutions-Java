import java.util.*;

public class ccc15s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> map = new Stack<Integer>();
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if (a==0) map.pop();
			else map.add(a);
		}
		
		int sum = 0;
		for (int i: map) sum+=i;
		
		System.out.println(sum);
		
	}
}
