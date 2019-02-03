package contest_questions;

import java.io.*;
import java.util.*;

public class ccc15s3 {
	
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		
		int g = sc.nextInt(), p = sc.nextInt();
		
		boolean[] occupied = new boolean[g+1];
		occupied[0] = true;
		
		//start from most
		int count = 0;
		for (int i=0; i<p; i++){
			int a = sc.nextInt();
			boolean flag = false;
			for (int l=a; l>=0; l--){
				if (!occupied[l]){
					occupied[l] = true; flag = true;
					break;
				}
			}
			if (!flag) break;
			count++;
		}
		System.out.println(count);
	}

}
