import java.util.Scanner;
import java.util.Stack;

public class ccc05j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack <String> s = new Stack <String>();
		
		while (true) {
			String S = sc.next();
			if (S.equals("SCHOOL")) break;
			s.push(S);
		}
		
		while (true) {
			String direction = s.pop();
			String D = "";
			
			if (direction.equals("L")) {
				D = "RIGHT";
			} else {
				D = "LEFT";
			}
			
			if (s.isEmpty()) {
				System.out.println("Turn " + D + " into your HOME.");
				break;
			}
			
			String street = s.pop();
			System.out.println("Turn " + D + " onto " + street + " street.");
			
		}
		
	}

}
