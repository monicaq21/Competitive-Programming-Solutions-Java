import java.util.*;
import java.io.*;

public class ccc15s3 {

	public static void main(String[] zargs) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int g = sc.nextInt();
		int p = sc.nextInt();
		
		TreeSet<Integer> map = new TreeSet<Integer>();
		
		for (int i = 1; i <= g; i++) map.add(i);
		
		for (int i = 0; i < p; i++) {
			
			int a = sc.nextInt();
			Integer maxPossible = map.floor(a);
			
			if (maxPossible == null) {
				System.out.println(i);
				return;
			}
			
			map.remove(maxPossible);
				
		}
		
		System.out.println(p);
		
	}
}
