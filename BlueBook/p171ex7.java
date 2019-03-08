import java.util.*;

public class p171ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] range = new int[6];
		
		while (true) {
			int a = sc.nextInt();
			if (a == -1) break;
			
			if (a >= 0 && a <= 9999) range[0]++;
			else if (a >= 10000 && a <= 19999) range[1]++;
			else if (a >= 20000 && a <= 29999) range[2]++;
			else if (a >= 30000 && a <= 39999) range[3]++;
			else if (a >= 40000 && a <= 49999) range[4]++;
			else if (a >= 50000 && a <= 1000000) range[5]++;
			
			
		}
		
		for (int i: range) System.out.println(i);
		
	}
}
