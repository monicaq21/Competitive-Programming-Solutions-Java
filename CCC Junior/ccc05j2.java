import java.util.Arrays;
import java.util.Scanner;

public class ccc05j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), 
				B = sc.nextInt(), 
				count = 0,
				Count = 0;

		for (int k=A; k<=B; k++){
			for (int i=1; i<=k; i++){
				if (k%i==0) count++;
			} 
			if (count==4) Count++;
			count = 0;
		}
		System.out.println("The number of RSA numbers between "+A+" and "+B+" is "+Count);
	}

}
