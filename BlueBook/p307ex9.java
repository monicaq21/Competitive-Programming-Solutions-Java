import java.util.Scanner;

public class p307ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);

		int a = sc.nextInt();
		for (int i = 0; i<a; i++){
			int b = sc.nextInt();
			if (b%400==0){
				System.out.println("1");
			} else if (b%4==0 && b%100!=0){
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

}
