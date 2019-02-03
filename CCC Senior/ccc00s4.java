package other_questions;

import java.util.*;

public class ccc00s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int n = sc.nextInt();
		int[] b = new int[d+1];
		Arrays.fill(b, Integer.MAX_VALUE);
		b[0]=0;
		for (int i=0; i<n; i++){
			int k = sc.nextInt();
			b[k] = 1;
		}


		for (int i=1; i<b.length; i++){
			if (b[i]<Integer.MAX_VALUE){
				continue;
			} else {
				int min = Integer.MAX_VALUE;
				int big = (int)Math.ceil(i/2.0);
				int small = (int)Math.floor(i/2.0);
				while (true){
					if (b[big]!=Integer.MAX_VALUE&&b[small]!=Integer.MAX_VALUE){
						if (b[big]+b[small]<min){
							min = b[big]+b[small];
						}
					}
					big++;
					small--;
					if (small<0||big>=d){
						break;
					}
				}
				b[i] = min;
			}
		}
		if (b[d]==Integer.MAX_VALUE){
			System.out.println("Roberta acknowledges defeat.");
		} else 
		System.out.println("Roberta wins in "+b[d]+" strokes.");



	}

}
