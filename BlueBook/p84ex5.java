import java.util.Scanner;

public class p84ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (b==0 && a==0){
			System.out.println("indeterminate");
		} else if (a==0){
			System.out.println("undefined");
		} else {
			double c = -b/a;
			System.out.printf("%.2f",c);
		}
		
	}

}
