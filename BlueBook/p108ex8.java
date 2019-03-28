import java.util.Scanner;

public class p108ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
    
		for (int i = 0; i < T; i++){
			int N = sc.nextInt();
      
			if (N >= 0 && N <= 45){
				System.out.println("N");
			} else if (N >= 45 && N <= 135){
				System.out.println("E");
			} else if (N >= 135 && N <= 225){
				System.out.println("S");
			} else if (N >= 225 && N <= 315){
				System.out.println("W");
			} else if (N > 315){
				System.out.println("N");
			}
		}


	}


}
