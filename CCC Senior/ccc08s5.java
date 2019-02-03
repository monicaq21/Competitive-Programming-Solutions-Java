package contest_questions;

import java.util.*;

public class ccc08s5 {
	
	static boolean[][][][] win;
	static boolean[][][][] been;
	
	public static boolean find(int a, int b, int c, int d){
		if (a<0||b<0||c<0||d<0){
			return true;
		}
		if (been[a][b][c][d]){
			return win[a][b][c][d];
		}
		been[a][b][c][d] = true;
		return win[a][b][c][d] =(!find(a-2,b-1,c,d-2)|!find(a-1,b,c,d-1)|!find(a,b-3,c,d)
				|!find(a-1,b-1,c-1,d-1)|!find(a,b,c-2,d-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		win = new boolean[31][31][31][31];
		been = new boolean[31][31][31][31];
		
		//A B C D
		//2 1 0 2
		//1 1 1 1
		//0 0 2 1
		//0 3 0 0
		//1 0 0 1
		
		
		//4D array to store
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (!find(a,b,c,d)){
				System.out.println("Roland");
			} else {
				System.out.println("Patrick");
			}
		}
		
		
		
	}

}
