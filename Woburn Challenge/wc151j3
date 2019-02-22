import java.util.Arrays;
import java.util.Scanner;

public class wc151j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = 10;
		int[] I = new int[n];
		for (int i=0; i<n; i++){
			I[i] = sc.nextInt();
		}
		Arrays.sort(I);
		
		for (int i=0; i<n; i++){
			time+=I[i];
			if (i==n-1 || i==n-2){
				time+=I[i];
			}
		}
		System.out.println(time);
		
	}

}
