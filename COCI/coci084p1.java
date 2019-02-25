import java.io.*;
import java.util.*;
public class coci084p1 {
	
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
        
        int[] a = new int[5];
        for (int i=0; i<5; i++) a[i] = sc.nextInt();
        int j = 0;
        while (a[0]!=1||a[1]!=2||a[2]!=3||a[3]!=4){
        	if (j==4) j=0;
        	if (a[j]>a[j+1]){
        		int p = a[j];
        		a[j] = a[j+1];
        		a[j+1] = p;
        		for (int i: a) System.out.print(i+" ");
            	System.out.println();
        	}
        	j++;
        }
    }
}
