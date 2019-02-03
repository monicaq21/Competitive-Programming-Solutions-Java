import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc15j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] R = new int[101];
		int[] S = new int[101];
		Arrays.fill(R, -1);
		
		int t = 0;
		sc.nextLine();
		for (int i=0; i<n; i++){
			String q = sc.nextLine();
			String[] p = q.split(" ");
			int x = Integer.parseInt(p[1]);
			if (q.contains("R")){
				if (R[x]==-1){
					R[x] = t;
					S[x] = -1;
				} else {
					R[x]+=(t-S[x]);
					S[x] = -1;
				}
			} else if (q.contains("W")){
				t+=x-2;
			} else {
				S[x] = t;
			}
			t++;

		}

		for (int i=0; i<101; i++){
			if (S[i]==-1){
				System.out.println(i+" -1");
			} else if (S[i]>=1){
				System.out.println(i+" "+(S[i]-R[i]));
			}

		}


	}

}
