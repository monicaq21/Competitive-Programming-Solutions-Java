import java.util.Scanner;

public class ccc13j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		String word = sc.nextLine();
		String I = word.replace("I", "");
		String O = I.replace("O", "");
		String S = O.replace("S", "");
		String H = S.replace("H", "");
		String Z = H.replace("Z", "");
		String X = Z.replace("X", "");
		String N = X.replace("N", "");
		if (N.length()>0){
			System.out.println("NO");
		} else if (N.length()==0){
			System.out.println("YES");
		}
		
		
	}

}
