import java.util.*;

public class ccc07s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		ArrayList<Integer>[] map = new ArrayList[v];
		
	    	for (int i=0; i<map.length; i++){
	    		map[i] = new ArrayList<Integer>();
	   	}
		
		while (true){
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			if (r==-1&&c==-1){
				break;
			}
			map[r].add(c);
			map[c].add(r);
		}
		
		int[] ways = new int[v+1];
		ways[0] = 1;
		for (int i=0; i<v; i++){
			for (int l=i+1; l<v; l++){
				if (map[i].contains(l)){
					ways[l] += ways[i];
				}
			}
		}
		System.out.println(ways[v-1]);
		
	}

}
