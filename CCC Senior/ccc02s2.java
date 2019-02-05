import java.util.*;

public class ccc02s2 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		int b = sc.nextInt();
    
		if (a%b==0){
			System.out.println(a/b);
		} else{
			int n = (a%b);
			if ((int)(a/b)!=0){
				System.out.print((int)(a/b)+" ");
			}

			for (int i=2; i<=n; i++){
				if (b%i==0&&n%i==0){
					b/=i;
					n/=i;
				}
			}
			System.out.println(n+"/"+b);
			
		}

	}

}
