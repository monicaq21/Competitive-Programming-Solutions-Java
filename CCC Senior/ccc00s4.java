import java.util.*;

public class ccc00s4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt(), n = sc.nextInt();
		int[] dist = new int[d + 1];
		Arrays.fill(dist, 1<<30);
		dist[0] = 0;

		for (int i = 0; i < n; i++){
			int a = sc.nextInt();
			
			for (int l = 0; l < d; l++){
				if (dist[l] != 1<<30 && a + l <= d && dist[l + a] > dist[l] + 1){
					dist[l + a] = dist[l] + 1;
				}
			}
		}
		
		if (dist[d] == 1<<30) System.out.println("Roberta acknowledges defeat.");
		else if (dist[d] == 1) System.out.println("Roberta wins in 1 stroke.");
		else System.out.println("Roberta wins in "+dist[d]+" strokes.");
		
		
		
	}

}
