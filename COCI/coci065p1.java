import java.util.*;

public class coci065p1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		String s = sc.nextLine();
		char[] k = s.toCharArray();
		int[] c = {1, 2, 3};
		
		for (int i = 0; i < s.length(); i++){
			if (k[i] == 'A'){
				A(c);
			} else if (k[i] == 'B'){
				B(c);
			} else{
				C(c);
			}
		}
		
		for (int i = 0; i < 3; i++){
			if (c[i] == 1){
				System.out.println(i + 1);
			}
		}
		
		
	}
	
	public static int[] A (int[] c){
		int p = c[0];
		c[0] = c[1];
		c[1] = p;
		return c;
	}
	
	public static int[] B (int[] c){
		int p = c[1];
		c[1] = c[2];
		c[2] = p;
		return c;
	}
	
	public static int[] C (int[] c){
		int p = c[0];
		c[0] = c[2];
		c[2] = p;
		return c;
	}
	
	
}
