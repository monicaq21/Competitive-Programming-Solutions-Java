import java.util.Scanner;

public class ccc18j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		boolean f = true;
		
		if (one == 8 || one==9){
			if (four == 8 || four == 9){
				if (two == three){
					System.out.println("ignore");
					f = false;
				}
			}
		}
		
		if (f) {
			System.out.println("answer");
		}
		
	}

}
