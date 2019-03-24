import java.util.*;

public class ccc16s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int question = sc.nextInt();
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int c = 0;

		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);

		if (question == 1){
			for (int i = 0; i < n; i++){
				if (a[i] > b[i]){
					c = c + a[i];
				} else {
					c = c + b[i];
				}
			}
		} else {
			for (int i = 0; i < n; i++){
				if (a[i] > b[n - 1 - i]){
					c = c + a[i];
				} else {
					c = c + b[n - 1 - i];
				}
			}
		}

		System.out.println(c);
		
	}

}
