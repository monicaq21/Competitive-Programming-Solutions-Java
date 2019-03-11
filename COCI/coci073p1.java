import java.util.*;

public class coci073p1 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] a = {n,b,c};
		Arrays.sort(a);
		
		if (a[1]-a[0]==a[2]-a[1]) {
			System.out.println(a[2]+a[2]-a[1]);
		} else if (a[1]-a[0]>a[2]-a[1]) {
			System.out.println(a[0]+a[2]-a[1]);
		} else {
			System.out.println(a[1]+a[1]-a[0]);
		}
		
		
		
	}
}
