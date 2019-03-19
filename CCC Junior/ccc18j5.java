package contest_questions;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc18j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int minPath = Integer.MAX_VALUE;
		int[] step = new int[N];
		boolean[][] a = new boolean[N][N];
		LinkedList<Integer> endPage = new LinkedList<Integer>();
		LinkedList <Integer> nextPage = new LinkedList <Integer>();

		for (int i = 0; i < N; i++){
			int n = sc.nextInt();
			if (n == 0){
				endPage.add(i);
			}
			for (int l = 0; l < n; l++){
				int nextPage = sc.nextInt();
				a[i][nextPage - 1] = true;
			}
		}
		nextPage.add(0);

		
		for (int i = 0; i < N; i++){
			step[i] = Integer.MAX_VALUE;
		}
		step[0] = 1;
		
		while (!nextPage.isEmpty()){
			int p = nextPage.poll();

			for (int i = 0; i < N; i++){
				if (a[p][i]){
					if (step[i] > step[p] + 1){
						step[i] = step[p] + 1;
						if (endPage.contains(i)){
							if (minPath > step[i]){
								minPath = step[i];
							}
							
						} else {
							nextPage.add(i);
						}
					}
				}
			}
			
		}
		
		boolean reach = true;
		
		for (int i = 0; i < step.length; i++) {
			if (step[i] == Integer.MAX_VALUE) {
				reach = false;
			}
		}

		if (reach) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		System.out.println(minPath);


	}

}
