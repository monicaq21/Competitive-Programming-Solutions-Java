package contest_questions;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ccc09s4 {
	
	//CORRECT but TOO SLOW
	
	public static class Node implements Comparable<Node>{
		int v;	  //vertex
		int step; //cost
		
		//constructor
		public Node(int v, int steps){ 
			this.v = v;
			this.step = step;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (this.step<o.step){
				return -1;
			} else if (this.step==o.step){
				return 0;
			} else {
				return 1;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//number of cities
		int T = sc.nextInt();//number of trade routes
		int[][] map = new int[N][N];
		//input T edges and store into map
		for (int i=0; i<T; i++){
			int bv = sc.nextInt()-1;
			int ev = sc.nextInt()-1;
			int cost = sc.nextInt();
			map[bv][ev]=cost;
			map[ev][bv]=cost;
		}
		
		int K = sc.nextInt();//how many stores
		int[] price = new int[N]; //vertex number is index
		for (int i=0; i<K; i++){ 
			int V = sc.nextInt()-1;
			price[V] = sc.nextInt();
		}
		
		//destination:beginning location for dijkstra
		int D = sc.nextInt()-1;
		
		//BFS Dijkstra
		//step
		int[] steps = new int[N];
		Arrays.fill(steps, Integer.MAX_VALUE);
		steps[D]=0;
		//queue: type is Node (stores multiple values:vertex and steps/cost)
		PriorityQueue <Node> queue = new PriorityQueue <Node>();
		queue.add(new Node(D,steps[D]));
		
		while (!queue.isEmpty()){
			Node cur = queue.poll();
			int bv = cur.v;
			int step = cur.step;
			for (int ev=0; ev<N; ev++){
				if (map[bv][ev]!=0 && steps[ev]>steps[bv]+map[bv][ev]){
												//no longer +1: need to add cost
					steps[ev]=steps[bv]+map[bv][ev];
					queue.add(new Node(ev,steps[ev]));
				}
			}
		}
		
		//dijkstra finished
		//this is only shipping fee
		
		//use for loop to get the minimum shipping pencil fee
		int min = Integer.MAX_VALUE;
		for (int i=0; i<N; i++){
			if (price[i]!=0&&steps[i]+price[i]<min){
				min=steps[i]+price[i];
			}
		}
		System.out.println(min);
		
		
	}
}
