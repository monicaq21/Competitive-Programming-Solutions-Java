import java.util.*;
import java.io.*;

public class ccc14s4 {

	public static class line implements Comparable<line>{
		int x, ystart, yend, tint;
		public line(int w, int ys, int ye, int t){
			x = w;
			ystart = ys;
			yend = ye;
			tint = t;
		}
		@Override
		public int compareTo(line o) {
			// TODO Auto-generated method stub
			if (x == o.x) return o.tint - tint; 
			return x - o.x;
		}
	}
	
	public static class point implements Comparable<point>{
		int index, state; //index is the y-coor
		public point(int i, int s){
			index = i;
			state = s;
		}
		
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			if (index == o.index){
				return o.state - state;
			}
			return index - o.index;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		
		int n = sc.nextInt(), t = sc.nextInt();
		
		line lines[] = new line[2 * n];
		
		for (int i = 0; i < n; i++){
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), f = sc.nextInt();
			lines[2 * i] = new line(x1, y1, y2, f);
			lines[2 * i + 1] = new line(x2, y1, y2, -f);
		}
		
		Arrays.sort(lines);

		ArrayList<point> p = new ArrayList<point>();
		long sum = 0, total = 0;
		
		for (int i = 0; i < lines.length - 1; i++){
			p.add(new point(lines[i].ystart, lines[i].tint));
			p.add(new point(lines[i].yend, -lines[i].tint));
			Collections.sort(p);
			sum = 0;
			
			for (int l = 0; l < p.size() - 1; l++){
				sum += p.get(l).state;
				if (sum >= t){
					total += 1L * (p.get(l + 1).index - p.get(l).index) * (lines[i + 1].x - lines[i].x);
				}
			}
		}
		
		
		
		System.out.println(total);
		
		
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
