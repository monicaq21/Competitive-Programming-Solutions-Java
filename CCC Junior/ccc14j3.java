import java.util.Scanner;

public class ccc14j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n];
		int ap = 100;
		int dp = 100;
		
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++){
			if (a[i] > d[i]){
				dp -= a[i];
			} else if (a[i] < d[i]){
				ap -= d[i];
			} 
		}
		
		System.out.println(ap);
		System.out.println(dp);
		
	}

}
