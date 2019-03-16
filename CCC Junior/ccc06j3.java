import java.util.Scanner;

public class ccc06j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
		int[] b = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		while (true) {
			int count = 0;
			String s = sc.nextLine();
			if (s.equals("halt")) break;
			
			int A = a[s.charAt(0) - 97];
			count = A;
			
			if (s.length() == 1){
				System.out.println(A);
				continue;
			}
			
			for (int i = 1; i < s.length(); i++){
				if (b[s.charAt(i) - 97] != b[s.charAt(i - 1) - 97]) {
					count += a[s.charAt(i) - 97];
				} else {
					count += a[s.charAt(i) - 97] + 2;
				}
			}
			System.out.println(count);
		}
		



	}
