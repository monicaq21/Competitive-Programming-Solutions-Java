package contest_questions;

import java.io.*;
import java.util.*;

public class ccc09s4B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//http://wcipeg.com/problem/ccc09j4

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //Vertice amount
		int T = Integer.parseInt(br.readLine()); //Trade route edge amount
		int[][] trade = new int[N][N];
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bv = Integer.parseInt(st.nextToken())-1;
			int ev = Integer.parseInt(st.nextToken())-1;
			int cost = Integer.parseInt(st.nextToken());
			trade[bv][ev] = cost;
			trade[ev][bv] = cost;
		}

		int K = Integer.parseInt(br.readLine()); //pencil
		int[] price = new int[N];
		for (int i=0; i<K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken())-1;
			price[n] = Integer.parseInt(st.nextToken());
		}

		int D = Integer.parseInt(br.readLine())-1;

		//Djikstra
		//Step
		//Queue
		//PriorityQueue<Node> queue = new PriorityQueue<Node>();
		int[] step = new int[N];
		for (int i=0; i<N; i++) {
			step[i] = Integer.MAX_VALUE;
		}
		step[D] = 0;
		boolean[] vis = new boolean[N];
		for (int i=0; i<N; i++) {
			int min = Integer.MAX_VALUE;
			int index = -1;
			for (int j=0; j<N; j++) {
					//isAt		&&	not visited
				if (min>step[j] && vis[j]==false) {
					min = step[j];
					index = j;
					//find the min steps of the neighbors
				}
			}
			//find index for the current vertice you pick to process
			//update neighbor step value
			vis[index] = true;
			for (int j=0; j<N; j++) { //i is your neighbor vertice
				if (trade[index][j]!=0 && vis[j]==false &&
						step[j]>step[index]+trade[index][j]) {
					step[j]=step[index]+trade[index][j];
				}
			}

		}
		//Add city D to queue
		//queue.add(new Node(D, step[D]));
		//	while (!queue.isEmpty()) {
		//	Node cur = queue.poll();
		//	//get all the neighbor
		//	for (int i=0; i<N; i++) { //i is your neighbor vertice
		//	if (trade[cur.v][i]!=0 && 
		//	step[i]>step[cur.v]+trade[cur.v][i]) {
		//	step[i]=step[cur.v]+trade[cur.v][i];
		//	queue.add(new Node(i,step[i]));
		//	}
		//	}
		//	}
		int min = Integer.MAX_VALUE;
		for (int i=0; i<N; i++) {
			if (price[i]!=0 && step[i]+price[i]<min) {
				min = step[i]+price[i];
			}
		}
		System.out.println(min);
	}

	public static class Node implements Comparable<Node>{
		int v; //city number
		int step;
		public Node(int v, int step) {
			this.v = v;
			this.step = step;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.step-o.step;
		}
	}

}