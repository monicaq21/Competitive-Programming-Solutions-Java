import java.util.Scanner;

public class ccc18j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		sc.nextLine();
		String s = sc.nextLine();
		String p = sc.nextLine();
		
		for (int i=0; i<n; i++){
			if (s.charAt(i)==p.charAt(i)&&s.charAt(i)=='C'){
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
