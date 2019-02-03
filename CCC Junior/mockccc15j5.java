package contest_questions;

import java.util.Scanner;

public class mockccc15j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//not done

		Scanner sc = new Scanner(System.in);

		long times = 0;
		int n = sc.nextInt();

		//2D array
		
		boolean a[][] = new boolean[n][n];
		for (int i=0; i<n; i++){
			int xc = sc.nextInt();
			int yc = sc.nextInt();
			a[xc][yc]=true;
		}


		//"queues"
		int m = sc.nextInt();
		int[] x = new int[m];
		int[] y = new int[m];
		for (int i=0; i<m; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}



		for (int i=1; i<m; i++){
			if (x[i]!=x[i-1]){
				if (x[i]>x[i-1]){
					for (int j=x[i-1]; j<=x[i]; j++){
						if (a[j][y[i]]){
							times++;
						}
					}
				} else if (x[i]<x[i-1]){
					for (int j=x[i]; j<=x[i-1]; j++){
						if (a[j][y[i]]){
							times++;
						}
					}
				}
			} else {
				if (y[i]>y[i-1]){
					for (int j=y[i-1]; j<=y[i]; j++){
						if (a[x[i]][j]){
							times++;
						}
					}
				} else if (y[i]<y[i-1]){
					for (int j=y[i]; j<=y[i-1]; j++){
						if (a[x[i]][j]){
							times++;
						}
					}
				}
			}
		}
		System.out.println(times);

	}

}
