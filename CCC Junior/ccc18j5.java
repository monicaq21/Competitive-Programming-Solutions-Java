package contest_questions;

import java.util.LinkedList;
import java.util.Scanner;

public class ccc18j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] a = new boolean[N][N]; //relationship table of the pages
		//each page number is a column, and rows are the pages it can go
		//only this is 2D array to show the connections between them
		//but the result is only 1D
		
		
		
		LinkedList <Integer> endPage = new LinkedList <Integer>();

		for (int i=0; i<N; i++){
			int n = sc.nextInt();
			if (n==0){
				endPage.add(i); //i = page number
			}
			for (int l=0; l<n; l++){
				int nextPage = sc.nextInt();
				a[i][nextPage-1] = true;
			}
		}

		LinkedList <Integer> nextPage = new LinkedList <Integer>(); //the queue

		int[] step = new int[N];
		for (int i=0; i<N; i++){
			step[i] = Integer.MAX_VALUE; //allow access in the future
			//because it is a bigger number that you haven't gotten to, so you know it is not visited
		}
		
		//store the starting point into queue
		//put step[first] = 0;
		nextPage.add(0);
		step[0] = 1;
		
		//go to queue to retrieve one item
		//visit the item's unvisited neighbor
		//the whole BFS start from adding the first page into queue
		//the whole BFS end when the queue is empty
		
		int minPath = Integer.MAX_VALUE;
		
		while (!nextPage.isEmpty()){ //when the queue isn't empty
			int p = nextPage.poll();
			
			//find all the unvisited
			//from 2D array a, you can find all page p's neighbor
			//go to row p to find all the true
			for (int i=0; i<N; i++){
				if (a[p][i]){ //if true means p can go to i
					if (step[i]>step[p]+1){ //check if unvisited
						//step value greater than current value +1
						step[i] = step[p]+1;
						if (endPage.contains(i)){ //if ended
							//minimum path
							if (minPath>step[i]){
								minPath = step[i];
							}
							
						} else { //unvisited but not ended
							nextPage.add(i);
						}
					}
				}
			}
			
		}
		boolean reach = true;
		
		for (int i=0; i<step.length; i++){
			if (step[i]==Integer.MAX_VALUE){
				reach = false;
			}
		}

		if (reach){
			System.out.println("Y");
		} else{
			System.out.println("N");
		}
		System.out.println(minPath);


	}

}
