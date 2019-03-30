import java.util.*;

public class p154ex7 {
	
	public static class node implements Comparable<node>{
		int index, times;
		public node(int i, int t) {
			index = i; 
			times = t;
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
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			
			String t = i + "";
			
			int sum = 0;
			
			for (int w = 0; w < t.length(); w++) {
				int p = Integer.parseInt(t.charAt(w) + "");
				int cube = (int) Math.pow(p, 3);
				sum += cube;
			}
			
			if (sum == i) System.out.println(i);
			
		}


	}
}
