import java.util.Scanner;

public class ccc12j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++){
			for (int l=0; l<n; l++){
				System.out.print("*");
			}
			for (int l=0; l<n; l++){
				System.out.print("x");
			}
			for (int l=0; l<n; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0; i<n; i++){
			for (int l=0; l<n; l++){
				System.out.print(" ");
			}
			for (int l=0; l<n; l++){
				System.out.print("xx");
			}
			System.out.println();
		}
		
		for (int i=0; i<n; i++){
			for (int l=0; l<n; l++){
				System.out.print("*");
			}
			for (int l=0; l<n; l++){
				System.out.print(" ");
			}
			for (int l=0; l<n; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
