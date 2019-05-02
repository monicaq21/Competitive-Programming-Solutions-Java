import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("taktakin.txt"));
		PrintWriter pw = new PrintWriter(new File("taktakout.txt"));
		
		int n = sc.nextInt();
		int times = 0;
		
		while (true) {
			if ((n - 1) % 11 == 0) {
				pw.print(times + " " + n);
				break;
			}
			
			n *= 2;
			times++;
		}
		
		pw.close();

	}
}
