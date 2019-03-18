import java.util.Scanner;

public class ccc14j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int votes = sc.nextInt();
		sc.nextLine();
		String results = sc.nextLine();
		String A = results.replace("B", "");
		String B = results.replace("A", "");
		int A1 = A.length();
		int B1 = B.length();
		
		
		if (A1 == B1 && results.length() > 0){
			System.out.println("Tie");
		} else if (A1 > B1){
			System.out.println("A");
		} else if (A1 < B1){
			System.out.println("B");
		}
		
		
		
	}
	
}
