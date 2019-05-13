import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("dishin.txt"));
		PrintWriter pw = new PrintWriter(new File("dishout.txt"));
		
		int n = sc.nextInt(), sum = 0, min = 1<<30, max = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum += a;
			min = Math.min(min, a);
			max = Math.max(max, a);
		}
		
		pw.println(min + " " + max + " " + (sum / n));
		pw.close();

	}
}
