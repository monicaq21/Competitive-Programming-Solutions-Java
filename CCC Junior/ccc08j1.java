import java.util.Scanner;

public class ccc08j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble(), height = sc.nextDouble();
    
		if (weight/(height*height) > 25) System.out.println("Overweight");
		else if (weight/(height*height) < 18.5) System.out.println("Underweight");
		else System.out.println("Normal weight");
    
	}
}
