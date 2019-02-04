import java.util.Scanner;

public class ccc17j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int startx = sc.nextInt();    
		int starty = sc.nextInt();
		int endx = sc.nextInt();
		int endy = sc.nextInt();
		int step = sc.nextInt();
		int total = Math.abs(endx-startx)+Math.abs(endy-starty);
		if (step%2 == total%2 && step>=total){
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		

		
	}

}
