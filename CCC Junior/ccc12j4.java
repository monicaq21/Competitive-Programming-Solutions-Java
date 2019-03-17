import java.util.*;

public class ccc12j4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		char[] k = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++){
			int c = k[i] - (n + 3 * (i + 1));
			if (c < 65){
				c += 26;
			}
			System.out.print((char)c);
		}
	}
}
