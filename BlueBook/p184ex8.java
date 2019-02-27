import java.util.*;
import java.io.*;

public class p184ex8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] count = new int[7];
		for (int i=0; i<n; i++) {
			String s = sc.next();
			int index = (int)(s.charAt(0))-65;
			if (index>=6||index<0)  count[6]++;
			else count[index]++;
		}
		
		for (int i: count) System.out.println(i);
		
	}
}
