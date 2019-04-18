import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class coci064p2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();

		sc.nextLine();

		char[][] a = new char[r][c];

		for (int i=0; i<r; i++){
			String s = sc.nextLine();
			a[i] = s.toCharArray();
		}
    

		for (int i=0; i<r; i++){
			for (int p=0; p<zr; p++){
				for (int l=0; l<c; l++){
					for (int q=0; q<zc; q++){
						System.out.print(a[i][l]);
					}
				}
				
				System.out.println();
			}
		}
	}
}
