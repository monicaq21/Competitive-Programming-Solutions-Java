package contest_questions;

import java.util.*;

public class ccc05s3 {
	
	//not solved
	
	static int[] a;
	
	
	public static String solve(int j){
		String s = a[j]+"";
		if (j==0){
			return s;
		} else {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		a = new int[n];
		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		solve(n-1);
		
	}

}
