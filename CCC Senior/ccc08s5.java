import java.util.*;

public class ccc08s5 {
	
	static boolean[][][][] dp, been;
	
	public static boolean win(int a, int b, int c, int d){
		//calculate win/loose for the prev
		if (a<0||b<0||c<0||d<0) return true;
		else if (been[a][b][c][d]) return dp[a][b][c][d];
		else {
			been[a][b][c][d] = true;

			dp[a][b][c][d] = !win(a-2,b-1,c,d-2) 
					|| !win(a-1,b-1,c-1,d-1)
					|| !win(a,b,c-2,d-1)
					|| !win(a,b-3,c,d)
					|| !win(a-1,b,c,d-1);
			return dp[a][b][c][d];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		dp = new boolean[31][31][31][31];
		been = new boolean[31][31][31][31];
		
		for (int i=0; i<t; i++){
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			if (win(a,b,c,d)) System.out.println("Patrick");
			else System.out.println("Roland");
		}
		
		
		
	}

}
