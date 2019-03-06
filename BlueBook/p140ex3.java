import java.util.Scanner;

public class p140ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		for (int i=0; i<n.length(); i++){
			System.out.println(n.charAt(n.length()-i-1));
		}
		

	}


}
