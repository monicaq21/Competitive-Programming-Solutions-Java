import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class coci072p2 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a%2==0){
			System.out.println((a/2+1)*(a/2+1));
		} else{
			System.out.println(((a-1)/2+1)*((a-1)/2+1)+((a-1)/2+1));

		}
		
		
		
	}
}
