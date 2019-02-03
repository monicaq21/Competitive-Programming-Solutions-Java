package contest_questions;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc18s3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//part marks
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		char[][] k = new char[n][m];
		int[][] steps = new int[n][m];
		LinkedList <Integer> qx = new LinkedList <Integer>();
		LinkedList <Integer> qy = new LinkedList <Integer>();


		for (int i=0; i<n; i++){
			String s = sc.nextLine();
			k[i]=s.toCharArray();
			for (int l=0; l<m; l++){
				steps[i][l] = Integer.MAX_VALUE;
			}
		}
		
		
		
		for (int i=0; i<n; i++){
			for (int l=0; l<m; l++){
				if (k[i][l]=='S'){
					qx.add(i);
					qy.add(l);
					steps[i][l]=0;
				} else if (k[i][l]=='W'){
					steps[i][l]=-1;
				} else if (k[i][l]=='C'){
					steps[i][l]=-1;
					for (int q=i; q<n; q++){
						if (k[q][l]=='.'){
							steps[q][l]=-1;
						}
						if (k[q][l]=='W'){
							break;
						}
					}
					for (int q=l; q<m; q++){
						if (k[i][q]=='.'){
							steps[i][q]=-1;
						}
						if (k[i][q]=='W'){
							break;
						}
					}
					for (int q=i; q>=0; q--){
						if (k[q][l]=='.'){
							steps[q][l]=-1;
						}
						if (k[q][l]=='W'){
							break;
						}
					}
					for (int q=l; q>=0; q--){
						if (k[i][q]=='.'){
							steps[q][l]=-1;
						}
						if (k[i][q]=='W'){
							break;
						}
					}
				}
			}
		}

		while (!qx.isEmpty()){
			int x = qx.poll();
			int y = qy.poll();

			if (x+1<n&&steps[x+1][y]!=-1&&steps[x+1][y]>steps[x][y]+1){
				if (k[x+1][y]=='.'){
					qx.add(x+1);
					qy.add(y);
					steps[x+1][y]=steps[x][y]+1;
				} else if (k[x+1][y]=='D'){
					qx.add(x+2);
					qy.add(y);
					steps[x+2][y]=steps[x][y]+1;
				}  else if (k[x+1][y]=='L'){
					qx.add(x+1);
					qy.add(y-1);
					steps[x+1][y-1]=steps[x][y]+1;
				}  else if (k[x+1][y]=='R'){
					qx.add(x+1);
					qy.add(y+1);
					steps[x+1][y+1]=steps[x][y]+1;
				} 
			} 
			if (y+1<m&&steps[x][y+1]!=-1&&steps[x][y+1]>steps[x][y]+1){
				if (k[x][y+1]=='.'){
					qx.add(x);
					qy.add(y+1);
					steps[x][y+1]=steps[x][y]+1;
				} else if (k[x][y+1]=='D'){
					qx.add(x+1);
					qy.add(y+1);
					steps[x+1][y+1]=steps[x][y]+1;
				}  else if (k[x][y+1]=='R'){
					qx.add(x);
					qy.add(y+2);
					steps[x][y+2]=steps[x][y]+1;
				}  else if (k[x][y+1]=='U'){
					qx.add(x-1);
					qy.add(y+1);
					steps[x-1][y+1]=steps[x][y]+1;
				}
			} 

			if (x-1>=0&&steps[x-1][y]!=-1&&steps[x-1][y]>steps[x][y]+1){
				if (k[x-1][y]=='.'){
					qx.add(x-1);
					qy.add(y);
					steps[x-1][y]=steps[x][y]+1;
				} else if (k[x-1][y]=='U'){
					qx.add(x-2);
					qy.add(y);
					steps[x-2][y]=steps[x][y]+1;
				}  else if (k[x-1][y]=='L'){
					qx.add(x-1);
					qy.add(y-1);
					steps[x-1][y-1]=steps[x][y]+1;
				}  else if (k[x+1][y]=='R'){
					qx.add(x-1);
					qy.add(y+1);
					steps[x-1][y+1]=steps[x][y]+1;
				} 
			} 


			if (y-1>=0&&steps[x][y-1]!=-1&&steps[x][y-1]>steps[x][y]+1){
				if (k[x][y-1]=='.'){
					qx.add(x);
					qy.add(y-1);
					steps[x][y-1]=steps[x][y]+1;
				} else if (k[x][y-1]=='D'){
					qx.add(x+1);
					qy.add(y-1);
					steps[x+1][y-1]=steps[x][y]+1;
				}  else if (k[x][y-1]=='L'){
					qx.add(x);
					qy.add(y-2);
					steps[x][y-2]=steps[x][y]+1;
				}  else if (k[x][y-1]=='U'){
					qx.add(x-1);
					qy.add(y-1);
					steps[x-1][y-1]=steps[x][y]+1;
				}
			}
		}


		for (int i=0; i<n; i++){
			for (int l=0; l<m; l++){
				if (k[i][l]=='.'){
					if (steps[i][l]==Integer.MAX_VALUE||steps[i][l]==-1){
						System.out.println(-1);
					} else {
						System.out.println(steps[i][l]);
					}
				}
			}
		}
	}

}


