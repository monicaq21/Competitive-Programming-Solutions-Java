package contest_questions;

import java.util.Scanner;

public class ccc11j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//not done
		
		Scanner sc = new Scanner(System.in);
		
		int ppl = sc.nextInt();
		boolean[][] a = new boolean[ppl][ppl]; 
		int count = 0;
		
		for (int i=0; i<ppl; i++){
			int n = sc.nextInt();
			a[n-1][i] = true;   //first is invite, second is invited. if first=false, second=false
		}
		
		for (int len=1; len<=ppl; len++){
			for (int l=0; l<ppl-len; l++){
				//l~l+len
				
			}
		}
		
	}

}
