import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("rainin.txt"));
		PrintWriter pw = new PrintWriter(new File("rainout.txt"));
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int cur = 0;
		int index = -1;
		
		for (int i = 0; i < n; i++) {
			cur += sc.nextInt();
      
			if (index == -1 && cur >= c) {
				index = i + 1;
			}
		}
		
		pw.println(index);
		
		pw.close();

	}
}
