import java.util.*;

public class mockccc3s2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] med = new int[n];
		
		for (int i=0; i<n; i++) {
			int[] map = new int[n];
			for (int l=0; l<n; l++){
				map[l] = sc.nextInt();
			}
			Arrays.sort(map);
			med[i] = map[n/2];
		}
		Arrays.sort(med);
		System.out.println(med[n/2]);
		
	}
}