import java.util.Scanner;

public class ccc11s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int count = 0;
		char[] a = new char[t];
		char[] b = new char[t];
		
		for (int i = 0; i < t; i++){
			String s = sc.next();
			a[i] = s.charAt(0);
		}
		
		for (int i = 0; i < t; i++){
			String s = sc.next();
			b[i] = s.charAt(0);
		}
		
		for (int i = 0; i < t; i++){
			if (a[i] == b[i]){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
