import java.util.*;
import java.io.*;

public class ccc15s4 {

	public static class node implements Comparable<node>{
		int index, time, hull;
		public node(int i, int t, int h) {
			index = i; time = t; hull = h;
		}
		@Override
		public int compareTo(node o) {
			// TODO Auto-generated method stub
			return time-o.time;
		}
	}

	public static class edge{
		int index,time,hull;
		public edge(int i, int t, int h) {
			index = i; time = t; hull = h;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();

		int[][] steps = new int[n+5][k+5];
		for (int i=0; i<n+5; i++) Arrays.fill(steps[i], 1<<30);

		ArrayList<edge>[] map = new ArrayList[n];
		for (int i=0; i<n; i++) map[i] = new ArrayList<edge>();


		for (int i=0; i<m; i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1, t = sc.nextInt(), h = sc.nextInt();
			map[a].add(new edge(b,t,h));
			map[b].add(new edge(a,t,h));
		}

		PriorityQueue<node> queue = new PriorityQueue<node>();
		int a = sc.nextInt()-1, b = sc.nextInt()-1;
		queue.add(new node(a,0,0));
		steps[a][0] = 0;

		while (!queue.isEmpty()) {
			node x = queue.poll();
			for (edge s: map[x.index]) {
				if (s.hull+x.hull>=k) continue;
				int newh = s.hull+x.hull, newt = s.time+x.time, newi = s.index;
				
				if (steps[newi][newh]>newt) {
					steps[newi][newh] = newt;
					queue.add(new node(newi,newt,newh));
				}
			}
		}

		System.out.println();

		int min = 1<<30;
		for (int i=0; i<k; i++) {
			min = Math.min(min, steps[b][i]);
		}

		if (min==1<<30) System.out.println(-1);
		else System.out.println(min);
	}

}
