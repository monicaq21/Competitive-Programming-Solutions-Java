package contest_questions;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc18s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//not done yet
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] c = new char[n][m];
		int[][] steps = new int[n][m];
		for (int i=0; i<n; i++){
			for (int l=0; l<m; l++){
				steps[i][l] = Integer.MAX_VALUE;
			}
		}
		
		
		
		int Startx = 0;
		int Starty = 0;
		LinkedList <Integer> directionx = new LinkedList <Integer>();
		LinkedList <Integer> directiony = new LinkedList <Integer>();
		LinkedList <Integer> togox = new LinkedList <Integer>();
		LinkedList <Integer> togoy = new LinkedList <Integer>();
		for (int i=0; i<n; i++){
			String s = sc.nextLine();
			c[i] = s.toCharArray();
			if (s.contains("S")){
				Startx = i;
				Starty = s.indexOf("S");
			}
			if (s.contains(".")){
				togox.add(i);
				togoy.add(s.indexOf("."));
			}
			if (s.contains("W")){
				steps[i][s.indexOf('W')]=-1;
			}
			if (s.contains("C")){
				steps[i][s.indexOf('C')]=-1;
			}
		}
		
		
		
		directionx.add(Startx);
		directiony.add(Starty);
		
		int p = 0;
		while (!directionx.isEmpty()){
			p++;
			int x = directionx.pop();
			int y = directiony.pop();
			int dotx = togox.pop();
			int doty = togoy.pop();
			for (int i=x-1; i<=x+1; i++){
				for (int l=y-1; l<=y+1; l++){
					if (c[i][l]!='C' && c[i][l]!='W'){
						if (steps[i][l]>steps[x][y]+1){
							steps[i][l]=steps[x][y]+1;
						}
						if (i==dotx && l==doty){
							System.out.println(steps[i][l]);
						}
						
					}
				}
			}
			
		}
		
		
		
		
		
	}

}
