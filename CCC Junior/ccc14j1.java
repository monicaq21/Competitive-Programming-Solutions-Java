import java.util.Scanner;

public class ccc14j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();
		int angle3 = sc.nextInt();
		
		if (angle1 + angle2 + angle3 != 180){
			System.out.println("Error");
		} else if (angle1 == angle2 && angle2 == angle3){
				System.out.println("Equilateral");
		} else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
			System.out.println("Isosceles");
		} else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3){
			System.out.println("Scalene");
		}
		
	}
	
}
