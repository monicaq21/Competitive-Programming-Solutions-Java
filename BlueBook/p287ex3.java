import java.util.Scanner;

public class p287ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		double m = 10001;
		for (int i=0; i<a; i++){
			double j = sc.nextDouble();
			if (j<m){
				m = j;
			}
		}
		
		
		System.out.printf("%.2f",m);
		
		
		
		
	}

}
