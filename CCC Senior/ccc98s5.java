import java.util.*;

public class ccc98s5 {
	
	static int[][] map, step;
	static int level;

	public static void dfs(int n, int x, int y){
		if (x+1<n&&Math.abs(map[x+1][y]-map[x][y])<=2&&step[x+1][y]>step[x][y]+1){
			step[x+1][y] = step[x][y];
			if (map[x+1][y]>level||map[x][y]>level) step[x+1][y]++;
			dfs(n,x+1,y);
		}
		if (x-1>=0&&Math.abs(map[x-1][y]-map[x][y])<=2&&step[x-1][y]>step[x][y]+1){
			step[x-1][y] = step[x][y];
			if (map[x-1][y]>level||map[x][y]>level) step[x-1][y]++;
			dfs(n,x-1,y);
		}
		if (y+1<n&&Math.abs(map[x][y+1]-map[x][y])<=2&&step[x][y+1]>step[x][y]+1){
			step[x][y+1] = step[x][y];
			if (map[x][y+1]>level||map[x][y]>level) step[x][y+1]++;
			dfs(n,x,y+1);
		}
		if (y-1>=0&&Math.abs(map[x][y-1]-map[x][y])<=2&&step[x][y-1]>step[x][y]+1){
			step[x][y-1] = step[x][y];
			if (map[x][y-1]>level||map[x][y]>level) step[x][y-1]++;
			dfs(n,x,y-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int q=0; q<t; q++){
			int n = sc.nextInt();
			step = new int[n][n];
			map = new int[n][n];
			for (int i=0; i<n; i++){
				Arrays.fill(step[i], 1<<30);
				for (int l=0; l<n; l++){
					map[i][l] = sc.nextInt();
				}
			}
			step[0][0] = 0;
			level = map[0][0];
			dfs(n,0,0);
			int d = step[n-1][n-1];
			if (d==1<<30) System.out.println("CANNOT MAKE THE TRIP");
			else System.out.println(d);
		}
	}

}
