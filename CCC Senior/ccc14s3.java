package contest_questions;

import java.util.*;

public class ccc14s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int w=0; w<t; w++){
			int n = sc.nextInt();
			
			
			//branch and mountain can happen at the same time
			
			Stack<Integer> branch = new Stack<Integer>(),
					mountain = new Stack<Integer>();
			int cur = 0;
			for (int i=0; i<n; i++) {
				int g = sc.nextInt()-1;
				mountain.push(g);
			}
			while (true){
				if (!branch.isEmpty()&&branch.peek()==cur){
					cur++; branch.pop();
				} else if (!mountain.isEmpty()&&mountain.peek()==cur){
					cur++; mountain.pop();
				} else if (!mountain.isEmpty()){
					int m = mountain.pop();
					branch.push(m);
				} else break;
			}
			if (cur==n) System.out.println("Y");
			else System.out.println("N");
			
		}
		
	}

}
