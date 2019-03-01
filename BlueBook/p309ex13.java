import java.util.Scanner;

public class p309ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int T = sc.nextInt();
		sc.nextLine();
    
		for (int i=0; i<T; i++) {
			String B1 = sc.nextLine();
			String N1 = sc.nextLine();
			String B2 = sc.nextLine();
			String N2 = sc.nextLine();
			String op = sc.nextLine();
			String BF = sc.nextLine();
			long b1 = Long.valueOf(N1, Integer.parseInt(B1));
			long b2 = Long.valueOf(N2, Integer.parseInt(B2));

			if (op.equals("+")) {
				System.out.println(Long.toString(b1+b2,Integer.parseInt(BF)));
			} else if (op.equals("-")) {
				System.out.println(Long.toString(b1-b2,Integer.parseInt(BF)));
			} else if (op.equals("*")) {
				System.out.println(Long.toString(b1*b2,Integer.parseInt(BF)));
			} else if (op.equals("/")) {
				System.out.println(Long.toString(b1/b2,Integer.parseInt(BF)));
			}

			if (i!=T-1) {
				sc.nextLine();
			}
		}
	}
}
