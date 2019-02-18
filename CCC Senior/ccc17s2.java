import java.util.*;

public class ccc17s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] q = new int[n];
    
		for (int i=0; i<n; i++){
			q[i]=sc.nextInt();
		}
		Arrays.sort(q);
    
		if (n%2==1){
			System.out.print(q[n/2]+" ");
			for (int i=n/2-1; i>=0; i--){
				System.out.print(q[n-1-i]+" "+q[i]+" ");
			}
		} else {
			for (int i=n/2-1; i>=0; i--){
				System.out.print(q[i]+" "+q[n-1-i]+" ");
			}
		}


	}

}
