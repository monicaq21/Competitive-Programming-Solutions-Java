import java.util.Scanner;

public class ccc00j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int days = sc.nextInt();

		System.out.println("Sun Mon Tue Wed Thr Fri Sat");

		for (int i = 0; i < start - 1; i++) {
			System.out.print("    ");
		}
		
		for (int i = 1; i < days + 1; i++){
			if (i<10) {
				if ((start + i - 1) % 7 == 0) {
					System.out.print("  " + i);
				} else {
					System.out.print("  " + i + " ");
				}

			} else {
				if ((i + start - 1) % 7 == 0) {
					System.out.print(" " + i);
				} else if (i == days) {
					System.out.print(" " + i);
				} else {
					System.out.print(" " + i + " ");
				}
			}
			
			if ((i + start - 1) % 7 == 0) {
				System.out.println();
			}
		}

		if (days % 7 != 0) {
			System.out.println();
		}

	}

}
