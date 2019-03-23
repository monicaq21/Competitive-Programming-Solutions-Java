import java.util.*;

public class ccc12s5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		boolean[][] cat = new boolean[r][c];
		int[][] ways = new int[r][c];
		ways[0][0] = 1;
		
		int cage = sc.nextInt();
		for (int i = 0; i < cage; i++){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			cat[x][y] = true;
		}
		
		for (int i = 0; i < r; i++){
			for (int l = 0; l < c; l++){
				if (i < r - 1 && !cat[i + 1][l]){
					ways[i + 1][l] += ways[i][l];
				}
				
				if (l < c - 1 && !cat[i][l + 1]){
					ways[i][l + 1] += ways[i][l];
				}
			}
		}
		
		
		System.out.println(ways[r - 1][c - 1]);
		
	}

}
