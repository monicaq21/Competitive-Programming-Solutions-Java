import java.util.Scanner;

public class ccc07s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int[] y = new int[n];
		int[] m = new int[n];
		int[] d = new int[n];
		for (int i=0; i<n; i++){
			y[i] = sc.nextInt();
			m[i] = sc.nextInt();
			d[i] = sc.nextInt();
			if (2007-y[i]>18){
				System.out.println("Yes");
			} else if (2007-y[i]<18){
				System.out.println("No");
			} else {
				if (m[i]==1){
					System.out.println("Yes");
				} else if (m[i]>2){
					System.out.println("No");
				} else if (d[i]>27){
					System.out.println("No");
				} else{
					System.out.println("Yes");
				}
			}
		}
		
		
		
		
	}

}
