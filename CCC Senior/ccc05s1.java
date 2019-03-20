import java.util.Hashtable;
import java.util.Scanner;

public class ccc05s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		String[] s = new String[n];
		Hashtable <Character, Integer> h = new Hashtable <Character, Integer>();
		
		h.put('A', 2);
		h.put('B', 2);
		h.put('C', 2);
		h.put('D', 3);
		h.put('E', 3);
		h.put('F', 3);
		h.put('G', 4);
		h.put('H', 4);
		h.put('I', 4);
		h.put('J', 5);
		h.put('K', 5);
		h.put('L', 5);
		h.put('M', 6);
		h.put('N', 6);
		h.put('O', 6);
		h.put('P', 7);
		h.put('Q', 7);
		h.put('R', 7);
		h.put('S', 7);
		h.put('T', 8);
		h.put('U', 8);
		h.put('V', 8);
		h.put('W', 9);
		h.put('X', 9);
		h.put('Y', 9);
		h.put('Z', 9);
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++){
			s[i] = sc.nextLine();
		}
			
		for (int i = 0; i < n; i++){
			s[i] = s[i].replace("-", "");
			char[] k = s[i].toCharArray();
			
			for (int l = 0; l < k.length; l++){
				if (l > 9) break;
				
				if (k[l] > '9'){
					System.out.print(h.get(k[l]));
				} else {
					System.out.print(k[l]);
				}
				
				if (l == 2 || l == 5){
					System.out.print("-");
				}
			}
			
			System.out.println();
		}
		
	}

}
