import java.io.*;
import java.util.*;
public class coci093p2 {
	
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
        
        double a = sc.nextInt();
        int b = sc.nextInt();
        double dig = Math.pow(10, b);
        a = Math.round(a / dig);
        System.out.println((int)(a*dig));
    }
}
