import java.util.Scanner;

public class ccc15j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String happy = A.replace(":-)", "");
		String sad = A.replace(":-(", "");
		String all = happy.replace(":-(", "");
		if (all.length()==A.length()){
			System.out.println("none");
		} else if (happy.length()>sad.length()){
			System.out.println("sad");
		} else if (happy.length()<sad.length()){
			System.out.println("happy");
		} else if (happy.length()==sad.length() && all.length()<A.length()){
			System.out.println("unsure");
		}
			
			
		
	}
	
}
