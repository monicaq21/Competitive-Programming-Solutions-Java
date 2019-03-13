import java.util.Scanner;

public class ccc03j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = 0;
			int y = 0;
			int max = Integer.MAX_VALUE;
			int n = sc.nextInt();

			if (n == 0) break;
			
			for (int i = 1; i <= n; i++){
				if (n % i == 0){
					int l = n / i;
					if (i * l == n && (i + l) * 2 < max){
						x = i;
						y = l;
						max = (i + l) * 2;
					}



				}
			}
			System.out.println("Minimum perimeter is " + max + " with dimensions " + x + " x " + y);
		}




	}

}
