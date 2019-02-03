package contest_questions;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc08s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Solved!

		int t = sc.nextInt();
		for (int q=0; q<t; q++){
			LinkedList <Integer> qx = new LinkedList <Integer> ();
			LinkedList <Integer> qy = new LinkedList <Integer> ();


			int r = sc.nextInt();
			int c = sc.nextInt();
			int br = 0;
			int bc = 0;
			int er = r-1;
			int ec = c-1;

			qx.add(br);
			qy.add(bc);
			int[][] steps = new int[r][c];
			char[][] a = new char[r][c];
			sc.nextLine();
			for (int i=0; i<r; i++){
				String s = sc.nextLine();
				for (int l=0; l<s.length(); l++){
					a[i][l]=s.charAt(l);
				}
			}
			for (int i=0; i<r; i++){
				Arrays.fill(steps[i], Integer.MAX_VALUE);
			}
			steps[0][0] = 0;


			while (!qx.isEmpty()){
				int x;
				x = qx.poll();
				int y;
				y = qy.poll();

				if (a[x][y]=='+'){
					if (x+1<r&&a[x+1][y]!='*'&&steps[x+1][y]>steps[x][y]+1){
						steps[x+1][y]=steps[x][y]+1;
						qx.add(x+1);
						qy.add(y);
					}


					if (y+1<c&&a[x][y+1]!='*'&&steps[x][y+1]>steps[x][y]+1){
						steps[x][y+1]=steps[x][y]+1;
						qx.add(x);
						qy.add(y+1);
					}

					if (x-1>=0&&a[x-1][y]!='*'&&steps[x-1][y]>steps[x][y]+1){
						steps[x-1][y]=steps[x][y]+1;
						qx.add(x-1);
						qy.add(y);
					}

					if (y-1>=0&&a[x][y-1]!='*'&&steps[x][y-1]>steps[x][y]+1){
						steps[x][y-1]=steps[x][y]+1;
						qx.add(x);
						qy.add(y-1);
					}



				} else if (a[x][y]=='|'){
					if (x+1<r&&a[x+1][y]!='*'&&steps[x+1][y]>steps[x][y]+1){
						steps[x+1][y]=steps[x][y]+1;
						qx.add(x+1);
						qy.add(y);
					}

					if (x-1>=0&&a[x-1][y]!='*'&&steps[x-1][y]>steps[x][y]+1){
						steps[x-1][y]=steps[x][y]+1;
						qx.add(x-1);
						qy.add(y);
					}


				} else if (a[x][y]=='-'){
					if (y+1<c&&a[x][y+1]!='*'&&steps[x][y+1]>steps[x][y]+1){
						steps[x][y+1]=steps[x][y]+1;
						qx.add(x);
						qy.add(y+1);
					}

					if (y-1>=0&&a[x][y-1]!='*'&&steps[x][y-1]>steps[x][y]+1){
						steps[x][y-1]=steps[x][y]+1;
						qx.add(x);
						qy.add(y-1);
					}



				}

			}
			

			if (steps[er][ec]+1==Integer.MAX_VALUE || steps[er][ec]+1==Integer.MIN_VALUE){
				System.out.println(-1);
			} else{
				System.out.println(steps[er][ec]+1);
			}


		}


	}
}

