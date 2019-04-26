import java.util.*;

public class wc152s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++) a[i] = sc.nextInt();
		
		for (int i=0; i<n; i++){
			if (a[i] > 0) continue;
			a[i] = 1;
			if (i == 0) {
				if (a[i+1] == a[i]) a[i] = 2;
			} else if (i == n - 1) {
				if (a[i-1] == a[i]) a[i] = 2;
			} else {
				while (true){
					if (a[i] == a[i-1] || a[i] == a[i+1]){
						a[i]++;
					} else break;
				}
			}
		}
		
		for (int i=0; i<n; i++) System.out.print(a[i]);
		
	}
}
