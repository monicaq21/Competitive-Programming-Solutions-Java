import java.util.*;

public class p175ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int w = 0; w < t; w++) {
			
			int n = sc.nextInt();
			int[][] table = new int[n][n];
			int[] row = new int[n], col = new int[n];

			for (int i = 0; i < n; i++) {
				for (int l = 0; l < n; l++) {
					table[i][l] = sc.nextInt();
					row[i] += table[i][l];
					col[l] += table[i][l];
				}
			}

			int value = row[0];
			boolean magicSq = true;

			for (int i: row) {
				if (i != value) {
					magicSq = false;
					break;
				}
			}

			for (int i: col) {
				if (i != value) {
					magicSq = false;
					break;
				}
			}

			if (magicSq) System.out.println("yes");
			else System.out.println("no");


		}

	}
}
