import java.util.*;

public class p129ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine().toLowerCase();
		String t = sc.nextLine().toLowerCase();
		char c = s.charAt(0);
		int count = 0;
		
		for (int i=0; i<t.length(); i++) {
			if (t.charAt(i)==c) count++;
		}
		
		System.out.println(t);
		System.out.println(count);
		
	}
}
