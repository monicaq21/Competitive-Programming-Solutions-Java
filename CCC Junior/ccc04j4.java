import java.util.*;

public class ccc04j4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		int n =0;
		
		String S = sc.nextLine();
		String t = "";
		
		for (int i=0; i<S.length(); i++){
			char k = S.charAt(i);
			if ((int)k<65||(int)k>90){
				continue;
			}
			//is one of the letters
			int o = n%a.length();
			int p = (int)k+(int)a.charAt(o)-65;
			if (p>90){
				p-=26;
			}
			t=t+""+(char)p;
			n++;
		}
		
		System.out.println(t);

	}

}
