import java.util.Arrays;
import java.util.Scanner;

public class ccc13j4 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int c = sc.nextInt();
		int[] a = new int[c];
		int count = 0;
		int countt = 0;

		for (int i = 0; i < c; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int i = 0; i < c; i++){
			count++;
			countt += a[i];
			if (countt > t){
				count--;
				break;
			}
		}
		System.out.println(count);


	}

}
