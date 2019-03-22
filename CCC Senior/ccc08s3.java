import java.io.*;
import java.util.*;

public class ccc08s3 {
	
	static int[] parent;

	public static class edge implements Comparable<edge> {
		int bv, ev, cost, danger;
		
		public edge (int b, int e, int c, int d){
			bv = b;ev = e;cost = c; danger = d;
		}
		@Override
		public int compareTo (edge o) {
			// TODO Auto-generated method stub
			if (danger == o.danger){
				return cost - o.cost;
			} 
			return danger - o.danger;
		}
	}
	
	public static int find (int i){
		if (parent[i] == -1) return i;
		else return find(parent[i]);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();

		int t = sc.nextInt();
		
		for (int w = 0; w < t; w++){
			int r = sc.nextInt(), c = sc.nextInt();
			char[][] map = new char[r][c];
			int[][] steps = new int[r][c];
			LinkedList<Integer> X = new LinkedList<Integer>();
			LinkedList<Integer> Y = new LinkedList<Integer>();
			
			for (int i = 0; i < r; i++){
				String s = sc.next();
				map[i] = s.toCharArray();
			}
			
			for (int i = 0; i < r; i++){
				Arrays.fill(steps[i], 1<<30);
			}
			
			steps[0][0] = 1;
			X.add(0); Y.add(0);
			
			while (!X.isEmpty()){
				int x = X.poll();
				int y = Y.poll();
				
				if (map[x][y] == '-' || map[x][y] == '+'){
					if (y + 1 < c && map[x][y + 1] != '*' && steps[x][y] + 1 < steps[x][y + 1]){
						steps[x][y + 1] = steps[x][y] + 1;
						X.add(x); Y.add(y + 1);
					} if (y - 1 >= 0 && map[x][y - 1] != '*' && steps[x][y] + 1 < steps[x][y - 1]){
						steps[x][y - 1] = steps[x][y] + 1;
						X.add(x); Y.add(y - 1);
					}
				}
				
				if (map[x][y] == '|' || map[x][y] == '+'){
					if (x + 1 < r && map[x + 1][y] != '*' && steps[x][y] + 1 < steps[x + 1][y]){
						steps[x + 1][y] = steps[x][y] + 1;
						X.add(x + 1); Y.add(y);
					} if (x - 1 >= 0 && map[x - 1][y] != '*' && steps[x][y] + 1 < steps[x - 1][y]){
						steps[x - 1][y] = steps[x][y] + 1;
						X.add(x - 1); Y.add(y);
					}
				}
			}
			
			if (steps[r - 1][c - 1] == 1<<30) System.out.println(-1);
			else System.out.println(steps[r - 1][c - 1]);
			
		}
		
	}
	
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}


}
