package contest_questions;

import java.util.Scanner;

public class mockccc15j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] k = new char[n][n];
		int total = 0;
		boolean flag = true;

		//horizontal
		for (int i=0; i<n; i++){
			String S = sc.next();
			for (int l = 0; l<n; l++){
				k[i][l] = S.charAt(l);
			}
		}

		for (int i=0; i<n; i++){
			for (int l=0; l<n; l++){
				if (k[i][l]!=k[i][n-l-1]){
					flag=false;
				}
			}
		}
		if (flag){
			total++;
		} else{
			flag=true;
		}


		//vertical
		for (int i=0; i<n; i++){
			for (int l=0; l<n; l++){
				if (k[i][l]!=k[n-1-i][l]){
					flag=false;
				}
			}
		}
		if (flag){
			total++;
		} else{
			flag=true;
		}

		//diagonal 1
		for (int i=0; i<n; i++){
			if (k[i][i]!=k[n-i-1][n-i-1]){
				flag=false;
			}
		}
		if (flag){
			total++;
		} else{
			flag=true;
		}
		
		//diagonal 2
		for (int i=0; i<n; i++){
			if (k[i][n-i-1]!=k[n-i-1][i]){
				flag=false;
			}
		}
		if (flag){
			total++;
		} else{
			flag=true;
		}
		
		System.out.println(total);
		
	}

}
