package contest_questions;

import java.util.*;

public class ccc00s4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//first way
//		int n = sc.nextInt();
//		int a = sc.nextInt();
//		int[] dp = new int[n+1];
//		Arrays.fill(dp, Integer.MAX_VALUE);
//		dp[0]=0;
//		for (int i=0; i<a; i++){
//			int b = sc.nextInt(), l=0;
//			while (l+b<=n){
//				if (dp[l]+1<dp[l+b]&&dp[l]<Integer.MAX_VALUE){
//					dp[l+b] = dp[l]+1;
//				}
//				l++;
//			}
//		}
//		if (dp[n]==Integer.MAX_VALUE) System.out.println("Roberta acknowledges defeat.");
//		else System.out.println("Roberta wins in "+dp[n]+" strokes.");
//		
		
		
		
		//second way
		int n = sc.nextInt();
		int b = sc.nextInt();
		int[] a = new int[b];
		for (int i=0; i<b; i++) a[i] = sc.nextInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i=1; i<=n; i++){
			for (int l=0; l<a.length; l++){
				if (i-a[l]>=0&&dp[i-a[l]]+1<dp[i]){
					dp[i] = dp[i-a[l]]+1;
				}
			}
		}
		
		if  (dp[n]==Integer.MAX_VALUE) System.out.println("Roberta acknowledges defeat.");
		else System.out.println("Roberta wins in "+dp[n]+" strokes.");
		
		
		
	}

}
