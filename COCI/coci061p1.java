import java.util.*;
import java.io.*;

public class coci061p1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> k = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt() % 42;
			if (!k.contains(a)) k.add(a);
		}
		
		System.out.println(k.size());
		



	}
}
