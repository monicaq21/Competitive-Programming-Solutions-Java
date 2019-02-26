import java.io.*;
import java.util.*;
public class coci091p1 {
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(InputStream x) {
            br = new BufferedReader(new
                    InputStreamReader(x));
        }

        String next() {
            while (st == null||!st.hasMoreElements()) {
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
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
	
	
    
    
    public static void main(String[] args) throws IOException{
        //TODO Auto-generated method stub
        FastReader sc = new FastReader(System.in);
        
        int N = 8;
        int[] a = new int[N];
        for (int i=0; i<N; i++){
        	a[i] = sc.nextInt();
        }
        
        int diff = a[1]-a[0];
        for (int i=1; i<7; i++){
        	if (a[i+1]-a[i]!=diff){
        		System.out.println("mixed");
        		return;
        	}
        }
        if (diff==1) System.out.println("ascending");
        else System.out.println("descending");
        
    }
}
