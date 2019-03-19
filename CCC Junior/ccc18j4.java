import java.util.*;
import java.io.*;

public class ccc18j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int max = 0, posx = 0, posy = 0;
		
		for (int i = 0; i < n; i++) {
			for (int l = 0; l < n; l++) {
				a[i][l] = sc.nextInt();
				
				if (a[i][l] > max) {
					max = a[i][l];
					posx = i;
					posy = l;
				}
			}
		}
    
		if (posx == n - 1 && posy == n - 1) {
			for (int i = 0; i < n; i++) {
				for (int l = 0; l < n; l++) {
					System.out.print(a[i][l] + " ");
				}
				System.out.println();
			}
			
		} else if (posx == n - 1) {
			for (int l = n - 1; l >= 0; l--) {
				for (int i = 0; i < n; i++) {
					System.out.print(a[i][l] + " ");
				}
				System.out.println();
			}
			
		} else if (posy == n - 1) {
			for (int l = 0; l < n; l++) {
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(a[i][l] + " ");
				}
				System.out.println();
			}
			
			
		} else {
			for (int i = n - 1; i >= 0; i--) {
				for (int l=n - 1; l >= 0; l--) {
					System.out.print(a[i][l] + " ");
				}
				System.out.println();
			}
			
		}
		
		
		
	}
}
