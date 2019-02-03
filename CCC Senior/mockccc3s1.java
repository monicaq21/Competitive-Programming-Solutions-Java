import java.util.*;

public class mockccc3s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] t = new int[26];
//		System.out.println((int)'a');
		String s = sc.nextLine();
		
		for (int i=0; i<s.length(); i++) {
			int w = s.charAt(i)-97;
			t[w]++;
		}
		Arrays.sort(t); int sum = 0;
		for (int i=0; i<24; i++) {
			sum += t[i];
		} System.out.println(sum);
		
	}
}