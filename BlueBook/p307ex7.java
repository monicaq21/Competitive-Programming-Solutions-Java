import java.util.Scanner;

public class p307ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int a = sc.nextInt();

		for (int i = 0; i<a; i++){
			int b = sc.nextInt();
			if (b<=100 && b>=80){
				System.out.println("A");
			} else if (b<=79 && b>=70){
				System.out.println("B");
			} else if (b<=69 && b>=60){
				System.out.println("C");
			} else if (b<=59 && b>=50){
				System.out.println("D");
			} else if (b<=49 && b>=0){
				System.out.println("F");
			} else {
				System.out.println("X");
			}
		}
		
		
		
	}

}
