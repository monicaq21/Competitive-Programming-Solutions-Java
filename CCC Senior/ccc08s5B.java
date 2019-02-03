package contest_questions;

import java.util.*;

public class ccc08s5B {
	
	//if a,b,c,d has been: return win(result)
	static boolean[][][][] win = new boolean[32][32][32][32];
	static boolean[][][][] been = new boolean[32][32][32][32];
	
	public static boolean solve(int a,int b,int c,int d){
		if (a<0||b<0||c<0||d<0){
			return true;
		}
		if (been[a][b][c][d]){
			return win[a][b][c][d];
		} else {
			been[a][b][c][d] = true;
			win[a][b][c][d] = (!solve(a-2,b-1,c,d-2)
				|!solve(a-1,b-1,c-1,d-1)
				|!solve(a,b,c-2,d-1)
				|!solve(a,b-3,c,d)
				|!solve(a-1,b,c,d-1));
			return win[a][b][c][d];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (!solve(a,b,c,d)){
				System.out.println("Roland");
			} else {
				System.out.println("Patrick");
			}
		}


	}

}
