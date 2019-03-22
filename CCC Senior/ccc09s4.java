import java.io.*;
import java.util.*;

public class ccc09s4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		int[][] trade = new int[N][N];
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bv = Integer.parseInt(st.nextToken()) - 1;
			int ev = Integer.parseInt(st.nextToken()) - 1;
			int cost = Integer.parseInt(st.nextToken());
			trade[bv][ev] = cost;
			trade[ev][bv] = cost;
		}

		int K = Integer.parseInt(br.readLine());
		int[] price = new int[N];
		
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()) - 1;
			price[n] = Integer.parseInt(st.nextToken());
		}

		int D = Integer.parseInt(br.readLine()) - 1;

		int[] step = new int[N];
		for (int i=0; i<N; i++) {
			step[i] = Integer.MAX_VALUE;
		}
		step[D] = 0;
		
		boolean[] vis = new boolean[N];
		for (int i = 0; i < N; i++) {
			int min = Integer.MAX_VALUE;
			int index = -1;
			
			for (int j = 0; j < N; j++) {
				if (min > step[j] && vis[j] == false) {
					min = step[j];
					index = j;
				}
			}

			vis[index] = true;
			
			for (int j = 0; j < N; j++) {
				if (trade[index][j] != 0 && vis[j] == false &&
						step[j] > step[index] + trade[index][j]) {
					step[j] = step[index] + trade[index][j];
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (price[i] != 0 && step[i] + price[i] < min) {
				min = step[i] + price[i];
			}
		}
		
		System.out.println(min);
	}

	public static class Node implements Comparable<Node> {
		int v, step;
		public Node (int v, int step) {
			this.v = v;
			this.step = step;
		}
		@Override
		public int compareTo (Node o) {
			// TODO Auto-generated method stub
			return this.step-o.step;
		}
	}

}
