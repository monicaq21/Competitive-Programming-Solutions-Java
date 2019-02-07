import java.io.*;

public class ccc08s2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true){
			int k = Integer.parseInt(in.readLine());
			if (k==0){
				break;
			} else{
				double pow = Math.pow(k, 2);
				int count =0;
				for (int x=0; x<=k; x++){
					count += (int)Math.sqrt(pow-Math.pow(x, 2));
				}
				System.out.println(4*count+1);
			}
		}
	}

}
