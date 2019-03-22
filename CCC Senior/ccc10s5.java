import java.util.*;

public class ccc10s5 {

	static int dp[][] = new int[2501][105];
	static int dpnext[][] = new int[2501][105];
	static int[] start = new int[105];
	static ArrayList<Integer>[] adj = new ArrayList[105];
	static int node_count = 1, string_pos = -1, x;
	static String s;

	static void parse(int N){
		adj[N] = new ArrayList<Integer>();
		string_pos++;
		
		while (s.charAt(string_pos) == ' '){
			++string_pos;
		}
		
		if (s.charAt(string_pos) == '('){
			++node_count;
			adj[N].add(node_count);
			parse(node_count);
			++node_count;
			adj[N].add(node_count);
			parse(node_count);
			++string_pos;
			
			while(s.charAt(string_pos) == ' '){
				++string_pos;
			}
		} else {
			int x = 0;
			
			while (string_pos < s.length() && '0' <= s.charAt(string_pos) && s.charAt(string_pos) <= '9'){
				x = x * 10 + s.charAt(string_pos) - '0';
				++string_pos;
			}
			
			start[N] = x;
			string_pos--;
		}
	}

	public static class node {
		node left;
		node right;
		node parent;
	}
	static node[] tree;

	public static void dfs(int x, int node){
		if (start[node] != 0){
			for (int i = 0; i <= x; i++){
				dp[i][node] = start[node] + i;
			}
		} else {
			int left = adj[node].get(0), right = adj[node].get(1);
			dfs(x,left);
			dfs(x,right);
			
			for (int i = 0; i <= x; i++){
				for (int l = 0; l <= x - i; l++){
					dp[i + l][node] = Math.max(dp[i + l][node], dpnext[i][left] + dpnext[l][right]);
				}
			}


		}

		for (int i = 0; i <= x; i++){
			for (int l = 0; l <= x - i; l++){
				dpnext[i + l][node] = Math.max(dpnext[i + l][node], 
							     (int) Math.min(Math.pow(l + 1, 2), dp[i][node]));
			}
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		parse(1);
		x = sc.nextInt();
		dfs(x,1);
		System.out.println(dp[x][1]);
	}

}
