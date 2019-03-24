//TLE

import java.util.*;
import java.io.*;

public class ccc15s3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int g = Integer.parseInt(in.readLine()), p = Integer.parseInt(in.readLine());
		int[] dock = new int[p];
		boolean[] occupied = new boolean[g];
		
		for (int i = 0; i < p; i++) {
			dock[i] = Integer.parseInt(in.readLine()) - 1;
		}
		
		int count = 0;
		
		for (int i = 0; i < p; i++) {
			int max = dock[i];
			
			while (true) {
				if (max == -1) {
					System.out.println(count);
					return;
				}
				
				if (!occupied[max]) {
					occupied[max] = true;
					count++;
					break;
				}
				max--;
			}
		}
		
		System.out.println(count);
		
	}
}
 
