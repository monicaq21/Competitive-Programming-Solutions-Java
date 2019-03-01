import java.util.Scanner;

public class p100ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		String c = sc.next();
    
		if (c.equals("MG")){
			System.out.println("midget girls");
		} else if (c.equals("MB")){
			System.out.println("midget boys");
		} else if (c.equals("JG")){
			System.out.println("junior girls");
		} else if (c.equals("JB")){
			System.out.println("junior boys");
		} else if (c.equals("SG")){
			System.out.println("senior girls");
		} else if (c.equals("SB")){
			System.out.println("senior boys");
		} else {
			System.out.println("invalid code");
		}
		

	}


}
