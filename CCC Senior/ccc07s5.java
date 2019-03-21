import java.util.*;
import java.io.*;

public class ccc07s5 {

	static int[][] dp;
	static boolean[][] been;
	
	public static int dfs(int balls, int start, int[] sum, int length, int n) {
		if (balls == 0) return 0;
		if (start >= n) return 0;
		if (been[balls][start]) return dp[balls][start];
		
		int newScore = sum[Math.min(start + length - 1, n - 1)];
		if (start > 0) newScore -= sum[start - 1];
		dp[balls][start] = Math.max(dfs(balls - 1, start + length, sum, length, n) + newScore, 
				dfs(balls, start + 1, sum, length, n));
		been[balls][start] = true;
		return dp[balls][start];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int T = 0; T < t; T++) {
			int n = sc.nextInt(), k = sc.nextInt(), w = sc.nextInt();
			int[] a = new int[n], sum = new int[n];
			sum[0] = a[0] = sc.nextInt();
			dp = new int[k + 1][n + 1];
			been = new boolean[k + 1][n + 1];

			for (int i = 1; i < n; i++) {
				a[i] = sc.nextInt();
				sum[i] = sum[i - 1] + a[i];
			}
			System.out.println(dfs(k, 0, sum, w, n));
		}





	}

	static class FastReader{ 
		BufferedReader br; StringTokenizer st; 
		public FastReader(InputStream x) { br = new BufferedReader(new InputStreamReader(x));} 
		String next() { while (st == null || !st.hasMoreElements()) {
			try { st = new StringTokenizer(br.readLine());}
			catch (IOException e) { e.printStackTrace();}
		} return st.nextToken();}
		int nextInt() { return Integer.parseInt(next());}
		long nextLong() { return Long.parseLong(next());}
		double nextDouble() { return Double.parseDouble(next());}
		String nextLine() { String str = "";
		try { str = br.readLine(); }
		catch (IOException e) { e.printStackTrace(); }
		return str;
		}
	}
}
