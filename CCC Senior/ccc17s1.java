import java.util.*;
import java.io.*;

public class ccc17s1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(in.readLine());
		
		LinkedList<Integer> l = new LinkedList <Integer>();
		int[] a = new int[n];
		int[] b = new int[n];
		int c = 0;
		int d = 0;
		
		String A = in.readLine();
		String[] aa = A.split(" ");
		for (int i = 0; i < n; i++){
			a[i] = Integer.parseInt(aa[i]);
		}
    
		String B = in.readLine();
		String[] bb = B.split(" ");
		for (int i = 0; i < n; i++){
			b[i] = Integer.parseInt(bb[i]);
		}
    
		boolean flag = true;
    
		for (int i = 0; i < n; i++){
			c += a[i];
			d += b[i];
			
			if (c == d){
				l.add(i + 1);
				flag = false;
			}
		}
    
		if (flag){
			System.out.println("0");
		} else {
			int[] w = new int[l.size()];
			
			for (int i = 0; i < w.length; i++){
				w[i] = l.poll();
			}
			
			Arrays.sort(w);
			
			System.out.println(w[w.length - 1]);
		}
		
		
	}

}
