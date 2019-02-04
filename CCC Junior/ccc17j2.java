import java.util.Scanner;

public class ccc17j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int v = k;
		
		for (int i=0; i<n; i++){
			v+=Math.pow(10, i+1)*k;
		}
		
		System.out.println(v);
		
	}

}
