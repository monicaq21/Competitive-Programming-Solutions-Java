import java.util.*;
import java.io.*;

public class p287ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.println(find(s));
		}
		
		
	}
	
	public static int find(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ') return (i + 1);
			
		}
		
		return 0;
		
	}
}
