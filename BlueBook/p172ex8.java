import java.util.*;

public class p172ex8 {
	
	public static class node implements Comparable<node>{
		int index, times;
		public node(int i, int t) {
			index=i; times=t;
		}
		@Override
		public int compareTo(node o) {
			// TODO Auto-generated method stub
			return times - o.times;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		node[] a = new node[101];
		for (int i=0; i<101; i++) {
			a[i] = new node(i,0);
		}
		
		while (true) {
			int w = sc.nextInt();
			if (w==-1) break;
			a[w].times++;
		}
		
		Arrays.sort(a);
		
		LinkedList<Integer> modes = new LinkedList<Integer>();
		modes.add(a[100].index);
		for (int i=99; i>=0; i--) {
			if (a[i].times==a[i+1].times) modes.add(a[i].index);
			else break;
		}
		
		Collections.sort(modes);
		for (int i: modes) System.out.println(i);
		
		
		
		
	}
}
