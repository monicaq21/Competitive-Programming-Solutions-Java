import java.util.*;

public class ccc12s2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			String s = sc.nextLine();
			int count = 0;
			
			for (int i = 0; i < s.length() - 2; i += 2){
				int n = Integer.parseInt(s.charAt(i) + "");
				int k = symbol(s.charAt(i + 1));
				int nextk = symbol(s.charAt(i + 3));
				
				if (k < nextk){
					count -= k * n;
				} else {
					count += k * n;
				}
			}
			
			int n = Integer.parseInt(s.charAt(s.length() - 2) + "");
			int k = symbol(s.charAt(s.length() - 1));
			count += n * k;
			
			System.out.println(count);
	}
	
		public static int symbol (char k){
			if (k == 'I'){
				return 1;
			} else if (k == 'V'){
				return 5;
			} else if (k == 'X'){
				return 10;
			} else if (k == 'L'){
				return 50;
			} else if (k == 'C'){
				return 100;
			} else if (k == 'D'){
				return 500;
			}
			
			return 1000;
		}
		
		
}
