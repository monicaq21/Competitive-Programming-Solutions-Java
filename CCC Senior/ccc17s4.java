import java.util.Arrays;
import java.util.Scanner;

public class ccc17s4 {

	int N;
	int M;
	Edge[] edge;
	int[] parent;

	public class Edge implements Comparable <Edge> {
		int bv, ev, cost, active;
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			if (this.cost < o.cost){
				return -1;
			} else if (this.cost > o.cost){
				return 1;
			} else {
				if (this.active < o.active){
					return -1;
				} else {
					return 0;
				}
			}

		}
	}

	public ccc17s4 (int v, int e){
		N = v;
		M = e;
		edge = new Edge[M];
		parent = new int[N];
		
		for (int i = 0; i < M; i++){
			edge[i] = new Edge();
		}
		for (int i = 0; i < N; i++){
			parent[i] = -1;
		}
	}

	public int find(int v){
		if (parent[v] == -1){
			return v;
		} else {
			return find(parent[v]);
		}
	}

	public void union(int bp, int ep){
		parent[bp] = ep;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int d = sc.nextInt();

		ccc17s4 graph = new ccc17s4 (N, M);
		
		for (int i = 0; i < M; i++){
			graph.edge[i].bv = sc.nextInt() - 1;
			graph.edge[i].ev = sc.nextInt() - 1;
			graph.edge[i].cost = sc.nextInt();
			
			if (i < N - 1){
				graph.edge[i].active = 0;
			} else {
				graph.edge[i].active = 1;
			}
		}

		Arrays.sort(graph.edge);

		int count = 0;
		int max = 0;
		int maxactive = 0;
		
		for (int i = 0; i < M; i++){
			int bv = graph.edge[i].bv;
			int ev = graph.edge[i].ev;
			int bp = graph.find(bv);
			int ep = graph.find(ev);
			
			if (bp != ep){
				graph.union(bp, ep);
			}
			
			count += graph.edge[i].active;
			max = graph.edge[i].cost;
			maxactive = graph.edge[i].active;
		}

		if (maxactive == 1){
			for (int i = 0; i < N; i++){
				graph.parent[i] = -1;
			}

			for (int i = 0; i < M; i++){
				int bv = graph.edge[i].bv;
				int ev = graph.edge[i].ev;
				int bp = graph.find(bv);
				int ep = graph.find(ev);
				
				if (bp != ep){
					if (graph.edge[i].cost < max || graph.edge[i].cost == max && graph.edge[i].active == 0){
						graph.union(bp, ep);
					} else if (graph.edge[i].active == 0 && graph.edge[i].cost <= 0){
						count--;
						break;
					}
				}
			}
		}

		System.out.println(count);

	}

}
