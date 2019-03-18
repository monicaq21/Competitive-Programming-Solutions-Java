import java.util.Scanner;

public class ccc15j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if (month == 1 || month == 2 && day < 18){
			System.out.println("Before");
		} else if (month > 2 || month == 2 && day > 18){
			System.out.println("After");
		} else if (month == 2 && day == 18){
			System.out.println("Special");
		}
		
	}

}
