import java.util.*;

public class ccc10s2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			sc.nextLine();
      
			LinkedList <String> name = new LinkedList <String>();
			LinkedList <String> code = new LinkedList <String>();
      
			for (int i = 0; i < n; i++){
				String t = sc.nextLine();
				String[] q = t.split(" ");
				String nam = q[0];
				String cod = q[1];
				name.add(nam);
				code.add(cod);
			}
      
			String s = sc.nextLine();
			LinkedList <String> S = new LinkedList <String>();
			
			for (int i = 0; i < s.length(); i++){
				S.add(s.charAt(i) + "");
			}
			
			String t = "";
			while (!S.isEmpty()){
				t = t + "" + S.poll();
				
				if (code.contains(t)){
					int q = code.indexOf(t);
					String nam = name.get(q);
					System.out.print(nam);
					t = "";
				}
				
			}
			
	}
}
