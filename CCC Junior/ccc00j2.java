import java.util.Scanner;

public class ccc00j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int count = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i=a; i<=b; i++){
			String s = i+""; //convert from i to string
			if (isRotate(s)){
				count++;
			}


		}
		System.out.println(count);
	}


	public static boolean isRotate (String s) {
		for (int i = 0; i<s.length(); i++){
			char forward = s.charAt(i);
			char backward = s.charAt(s.length()-1-i);
			if (forward==backward){ //no 6 paired with 9 (is palindrome)
				if (forward!='0' && forward!='1' && forward!='8'){
					return false; //getting rid of numbers with unreversable numbers
				}
			} else if (forward!='6' && forward!='9'){
				return false; //getting rid of numbers with unreversable numbers
			} else if (forward=='6' && backward!='9'){
				return false; 
			} else if (forward=='9' && backward!='6'){
				return false; 
			} 
		}
		return true;


	}
}
