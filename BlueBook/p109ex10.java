import java.util.Scanner;

public class p109ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] k = new String[5];

		int N = sc.nextInt();

		int quarter = N / 25;
		int dime = N % 25 / 10;
		int nickel = N % 25 % 10 / 5;
		int cent = N % 25 % 10 % 5 / 1;

		System.out.print(N + " cents requires ");
    
		if (quarter != 0){
			System.out.print(quarter + " quarter");
			
			if (quarter > 1){
				System.out.print("s");
			}
			
			if (dime + nickel + cent == 0){
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		
		if (dime != 0){
			System.out.print(dime + " dime");
			
			if (dime > 1){
				System.out.print("s");
			}
			
			if (nickel + cent == 0){
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		
		if (nickel != 0){
			System.out.print(nickel + " nickel");
			
			if (nickel > 1){
				System.out.print("s");
			}
			
			if (cent == 0){
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		
		if (cent != 0){
			System.out.print(cent + " cent");
			
			if (cent > 1){
				System.out.print("s");
			}
			
			System.out.print(".");
		}





	}

}
