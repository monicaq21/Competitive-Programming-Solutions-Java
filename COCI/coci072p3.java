import java.util.*;

public class coci072p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		LinkedList<String> l = new LinkedList<String>();

		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] k = new char[r][c];

		for (int i=0; i<r; i++){
			String s = sc.next();
			k[i]=s.toCharArray();
		}

		for (int i=0; i<r; i++){
			String s = "";
			for (int q=0; q<c; q++){
				if (k[i][q]!='#'){
					s+=k[i][q]+"";
				} else {
					if (s.length()>1){
						l.add(s);
					}
					s="";
				}
			}
			
			if (s.length()>1){
				l.add(s);
			}
		}
		
		
		
		for (int q=0; q<c; q++){
			String s = "";
			for (int i=0; i<r; i++){
				if (k[i][q]!='#'){
					s+=k[i][q]+"";
				} else {
					if (s.length()>1){
						l.add(s);
					}
					s="";
				}
			}
			
			if (s.length()>1){
				l.add(s);
			}
		}
		Collections.sort(l);
		System.out.println(l.peek());
	}
}
