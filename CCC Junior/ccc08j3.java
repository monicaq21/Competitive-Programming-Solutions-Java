import java.util.Scanner;

public class ccc08j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//GPS Text Entry
		String s = sc.nextLine();
		char[][] A = {{'A','B','C','D','E','F'},
				{'G','H','I','J','K','L'},
				{'M','N','O','P','Q','R'},
				{'S','T','U','V','W','X'},
				{'Y','Z',' ','-','.','*'}
		};
		int beginrow = 0, begincol = 0, step = 0;
    
		for (int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			for (int row = 0; row<5; row++){
				for (int col = 0; col<6; col++){
					if (A[row][col] == s.charAt(i)){
						step = step+Math.abs(row-beginrow)+Math.abs(col-begincol);
						beginrow = row;
						begincol = col;
					}
				}
			}



		}
		step = step+Math.abs(4-beginrow)+Math.abs(5-begincol);
		System.out.println(step);

	}

}
