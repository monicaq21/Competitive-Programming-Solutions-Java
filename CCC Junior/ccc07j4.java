import java.util.*;

public class ccc07j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine().replace(" ", "");
		String B = sc.nextLine().replace(" ", "");
		if (A.length()!=B.length()) {
			System.out.println("Is not an anagram.");
			return;
		}
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		Arrays.sort(a); Arrays.sort(b);
		for (int i=0; i<a.length; i++) {
			if (a[i]!=b[i]) {
				System.out.println("Is not an anagram.");
				return;
			}
		}
		System.out.println("Is an anagram.");
		
		
	}
}