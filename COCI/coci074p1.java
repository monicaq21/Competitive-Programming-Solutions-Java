import java.util.*;

public class coci074p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int first = a + b;
    
		int c = sc.nextInt();
		int d = sc.nextInt();
		int second = c + d;
    
    
		for (int i = 0; i < 3; i++){
			
			int n = sc.nextInt();
			boolean flag = false;
			boolean flag2 = false;
			
			if (n % first <= a && n % first != 0){
				flag = true;
			}
			if (n % second <= c && n % second != 0){
				flag2 = true;
			}
			
			if (flag && flag2){
				System.out.println("both");
			} else if (flag || flag2){
				System.out.println("one");
			} else {
				System.out.println("none");
			}
			
		}
		
	}
}
