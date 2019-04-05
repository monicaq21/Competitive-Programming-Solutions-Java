import java.util.Scanner;

public class p287ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int[] b = new int[A];
		
		sc.nextLine();
		
		for (int i = 0; i < A; i++){
			
			String S = sc.nextLine();
			S = S.replace("-", "");
			b[i] = S.length();
			
		}
		
		for (int i = 0; i < A; i++){
			System.out.println(b[i]);
		}



	}

}
