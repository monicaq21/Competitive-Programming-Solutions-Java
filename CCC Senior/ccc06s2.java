import java.util.Scanner;

public class ccc06s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
    
		for (int i=0; i<s3.length(); i++){
			char c = s3.charAt(i);
			int index = s2.indexOf(c);
			if (index==-1) {
				System.out.print(".");
			} else {
				System.out.print(s1.charAt(index));
			}
		}
    
	}
}
