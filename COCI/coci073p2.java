import java.util.Arrays;
import java.util.Scanner;

public class coci073p2 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		String s = sc.nextLine();
		String t = "";
		
		for (int i = 0; i < s.length() % 3; i++){
			s = "0" + s;
		}
		
		for (int i = 0; i < s.length(); i += 3){
			
			String S = s.charAt(i) + "" + s.charAt(i + 1) + "" + s.charAt(i + 2);
			
			int count = 0;
			
			if (S.charAt(0) == '1'){
				count += 4;
			}
			if (S.charAt(1) == '1'){
				count += 2;
			}
			if (S.charAt(2) == '1'){
				count += 1;
			}
			
			if (count != 0 || i != 0){
				System.out.print(count);
			}
		}
		
		
		
	}
}
