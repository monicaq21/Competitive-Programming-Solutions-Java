import java.util.Scanner;

public class ccc16j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next();
		String S2 = sc.next();
		String S3 = sc.next();
		String S4 = sc.next();
		String S5 = sc.next();
		String S6 = sc.next();
		String R1 = S1.replace("L", "");
		String R2 = S2.replace("L", "");
		String R3 = S3.replace("L", "");
		String R4 = S4.replace("L", "");
		String R5 = S5.replace("L", "");
		String R6 = S6.replace("L", "");
		
		int F = (R1.length() + R2.length() + R3.length() + R4.length() + R5.length() + R6.length());
		
		if (F == 0){
			System.out.println("-1");
		} else if (F == 1 || F == 2){
			System.out.println("3");
		} else if (F == 3 || F == 4){
			System.out.println("2");
		} else if (F == 5 || F == 6){
			System.out.println("1");
		}
		
		
			
			
		
	}
	
}
