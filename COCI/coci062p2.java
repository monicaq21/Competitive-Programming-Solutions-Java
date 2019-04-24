import java.util.*;

public class coci062p2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int o = sc.nextInt(), p = sc.nextInt(), op = sc.nextInt();
    
		sc.nextLine();
    
		String s = sc.nextLine();
		
    		int[] n = {o,p,op};
		
    		Arrays.sort(n);
		
		if (s.charAt(0) == 'C'){
      			System.out.print(n[2]);
    		} else if (s.charAt(0) == 'B'){
      			System.out.print(n[1]);
    		} else {
      			System.out.print(n[0]);
    		}
		
    		System.out.print(" ");
		
		if (s.charAt(1) == 'C'){
      			System.out.print(n[2]);
    		} else if (s.charAt(1) == 'B'){
      			System.out.print(n[1]);
    		} else {
      			System.out.print(n[0]);
    		}
		
    		System.out.print(" ");
		
		if (s.charAt(2) == 'C'){
      			System.out.print(n[2]);
    		} else if (s.charAt(2) == 'B'){
      			System.out.print(n[1]);
    		} else {
      			System.out.print(n[0]);
    		}
		
	}
}
