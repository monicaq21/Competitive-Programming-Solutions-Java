import java.util.Scanner;

public class p124ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		double m = sc.nextDouble();
		int y = sc.nextInt();

		System.out.print("0 ");
		System.out.printf("%.2f", n);
		System.out.println();

		for (int i = 1; i <= y; i++){
			n += n * (m / 100);
			System.out.print(i + " ");
			System.out.printf("%.2f", n);
			System.out.println();
		}


	}

}
