import java.io.*;
import java.util.*;

public class coci067p3 {
	
	public static class point implements Comparable<point>{
		int index, state;
		public point(int i, int s){
			index=i;
			state=s;
		}
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			if (index==o.index){
				return o.state-state;
			}
			return index-o.index;
		}
	}
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int length=sc.nextInt(), height=sc.nextInt();
		
		point[] list = new point[length*2+height];
		
		int j=0;
		
		for (int i=0; i<height; i++) {
			list[j] = new point(i+1,0);
			j++;
		}
		
		for (int i=0; i<length; i++){
			int n = sc.nextInt();
			if (i%2==0){
				list[j] = new point(1,1);
				j++;
				list[j] = new point(n,-1);
				j++;
			} else {
				list[j] = new point(height-n+1,1);
				j++;
				list[j] = new point(height,-1);
				j++;
			}
			
		}

		Arrays.sort(list);
		
		int value = 0, min = 1<<30, count = 0;
		
		for (int i=0; i<list.length; i++){
			if (list[i].state==0){
				if (value<min){
					count = 1;
					 min = value;
				} else if (value==min){
					count++;
				}
			} else {
				value+=list[i].state;
			}
		}
		
		System.out.println(min+" "+count);
		
		
		
		
		
	}
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
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
}
