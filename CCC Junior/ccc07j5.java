import java.util.*;

public class ccc07j5 {
	
	static int[] a;
	static long[] dp = new long[50];
	static boolean[] been = new boolean[50];
	static int min, max;
	
	public static boolean range(int middle) {
		return middle>=min&&middle<=max;
	}
	
	public static long trip(int index, long count) {
		if (a[index]>=7000) return 1;
		else if (been[index]) return dp[index];
		else {
			for (int i=index+1; i<a.length; i++) {
				if (range(a[i]-a[index])) {
					count += trip(i,0);
				}
			}
		been[index] = true;
		return dp[index] = count;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		min = sc.nextInt();
		max = sc.nextInt();
		int n = sc.nextInt();
		a = new int[50];
		a[0] = 0;
		a[1] = 990;
		a[2] = 1010;
		a[3] = 1970;
		a[4] = 2030;
		a[5] = 2940;
		a[6] = 3060;
		a[7] = 3930;
		a[8] = 4060;
		a[9] = 4970;
		a[10] = 5030;
		a[11] = 5990;
		a[12] = 6010;
		a[13] = 7000;
		for (int i=0; i<n; i++) {
			a[14+i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println(trip(0,0));
		
	}
}
