import java.util.Scanner;

public class ccc11s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int countT = 0, countS = 0;
		sc.nextLine();
    
		for (int i = 0; i < n; i++){
			String s = sc.nextLine();
			String st = s.replace("t", "");
			String ss = s.replace("s", "");
			
			st = st.replace("T", "");
			ss = ss.replace("S", "");
			
			countT += s.length() - st.length();
			countS += s.length() - ss.length();
		}
		
		if (countT <= countS) {
			System.out.println("French");
		} else {
			System.out.println("English");
		}
		
	}

}
