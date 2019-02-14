import java.util.Arrays;
import java.util.Scanner;

public class ccc13s2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int weight = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		int w=0;
		int[] a = new int[n];
    
		for (int i=0; i<n; i++){
		    int k = sc.nextInt();
			  a[i]=k;
		}
		boolean flag = true;

		for (int i=0; i<n; i++){
			if (i<4){
				w+=a[i];
				if (w>weight){
					System.out.println(i);
					flag=false;
					break;
				}
			} else{
				w+=a[i];
				w-=a[i-4];
				if (w>weight){
					System.out.println(i);
					flag=false;
					break;
				}
			}
			count++;
		}
    
		if (flag){
			System.out.println(count);
		}

	}
}
