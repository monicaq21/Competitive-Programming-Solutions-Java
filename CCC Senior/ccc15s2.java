import java.util.*;
import java.io.*;

public class ccc15s2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int j = Integer.parseInt(in.readLine()), ppl = Integer.parseInt(in.readLine());
		String[] J = new String[j];
		for (int i=0; i<j; i++) {
			J[i] = in.readLine();
		}
		
		int count = 0;
		for (int i=0; i<ppl; i++) {
			String[] q = in.readLine().split(" ");
			String s = q[0];
			int w = Integer.parseInt(q[1])-1;
			if (s.equals("L")&&J[w].equals("L")){
				count++; J[w] = "";
			} else if (s.equals("M")&&(J[w].equals("M")||J[w].equals("L"))){
				count++; J[w] = "";
			} else if (s.equals("S")&&!J[w].equals("")) {
				count++; J[w] = "";
			}
		}
		System.out.println(count);
		
	}
}
