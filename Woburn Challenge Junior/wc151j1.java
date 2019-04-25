import java.util.Scanner;
 
public class wc151j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = "REDBLUEWHITE";
		
		for (int i=0; i<2; i++){
			String k = sc.nextLine();
			s = s.replace(k, "");
		}
		
		System.out.println(s);
	}

}
