import java.util.Scanner;

public class ccc03s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int p = 1;
		
		while (true) {
			int k = sc.nextInt();
			
			if (k > 12 || k < 2){
				System.out.println("You Quit!"); 
				break;
			}
			
			p += k;
			if (p > 100){
				p -= k;
			} else if (p == 100){
				System.out.println("You are now on square 100");
				System.out.println("You Win!"); 
				break;
			} else if (p == 54){
				p = 19;
			} else if (p == 90){
				p = 48;
			} else if (p == 99){
				p = 77;
			} else if (p == 9){
				p = 34;
			} else if (p == 40){
				p = 64;
			} else if (p == 67){
				p = 86;
			}
			System.out.println("You are now on square " + p);
		}
	}

}
