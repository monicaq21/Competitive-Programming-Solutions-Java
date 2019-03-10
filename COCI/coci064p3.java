import java.util.*;

public class coci064p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int at = sc.nextInt();
		for (int i=0; i<n-1; i++){
			int a = at;
			int b = sc.nextInt();
			//common denominator
			int j=2;
			while (true){
				if (a%j==0&&b%j==0){
					a/=j;
					b/=j;
					continue;
				}
				j++;
				if (b==1||j>a||j>b){
					break;
				}
			}
			System.out.println(a+"/"+b);
		}
	}

}
