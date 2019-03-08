import java.util.*;

public class p108ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int w=0; w<t; w++) {

			double pay = sc.nextDouble(), hours = sc.nextDouble();
			String tax = sc.next();
			boolean donate = sc.next().equals("y");
			double wage = 0;

			if (hours <= 40) wage = pay * hours;
			else wage = pay * 40 + pay * (hours - 40) * 2;

			switch (tax) {
			case "A":
				break;
			case "B":
				wage *= 0.9;
				break;
			case "C":
				wage *= 0.8;
				break;
			case "D":
				wage *= 0.71;
				break;
			default:
				wage *= 0.65;
			}
			
			if (donate) wage -= 10;
			System.out.printf("%.2f", wage);
			System.out.println();
			

		}

	}
}
