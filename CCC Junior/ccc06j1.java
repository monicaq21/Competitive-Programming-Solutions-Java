import java.util.Scanner;

public class ccc06j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int burger = sc.nextInt(),
				side = sc.nextInt(),
				drink = sc.nextInt(),
				dessert = sc.nextInt();
		
		if (burger==1) burger = 461;
		else if (burger==2) burger = 431;
		else if (burger==3) burger = 420;
		else burger = 0;
		
		if (side==1) side = 100;
		else if (side==2) side = 57;
		else if (side==3) side = 70;
		else side = 0;
		
		if (drink==1) drink = 130;
		else if (drink==2) drink = 160;
		else if (drink==3) drink = 118;
		else drink = 0;

		if (dessert==1) dessert = 167;
		else if (dessert==2) dessert = 266;
		else if (dessert==3) dessert = 75;
		else dessert = 0;

		System.out.println("Your total Calorie count is " + (burger+side+drink+dessert) + ".");
		
	}

}
