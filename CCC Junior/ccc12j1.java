import java.util.Scanner;

public class ccc12j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		int recorded = sc.nextInt();
    
		if (recorded <= limit){
			System.out.println("Congratulations, you are within the speed limit!");
		} else if ((recorded - limit) >= 31){
			System.out.println("You are speeding and your fine is $500.");
		} else if ((recorded - limit) >= 21 && (recorded - limit) <= 30){
			System.out.println("You are speeding and your fine is $270.");
		} else if ((recorded - limit) >= 1 && (recorded - limit) <= 20){
			System.out.println("You are speeding and your fine is $100.");
		}
		
	}
	
}
