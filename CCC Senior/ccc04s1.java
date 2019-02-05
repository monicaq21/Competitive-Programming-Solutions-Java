import java.util.Scanner;

public class ccc04s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++){
			boolean flag = false;
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			if (a.endsWith(b) || a.startsWith(b) || a.endsWith(c) || a.startsWith(c)){
				flag=true;
			}
			if (b.endsWith(a) || b.startsWith(a) || b.endsWith(c) || b.startsWith(c)){
				flag=true;
			}
			if (c.endsWith(b) || c.startsWith(b) || c.endsWith(a) || c.startsWith(a)){
				flag=true;
			}
			
			if (!flag){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		
	}

}
