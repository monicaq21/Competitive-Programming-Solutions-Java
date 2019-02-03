import java.util.Scanner;

public class ccc11j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 2;
		
		while (true) {
			int c = a-b;
			count++;
			if (0<=b-c){
				a=b;
				b=c;
			} else{
				System.out.println(count);
				break;
			}
		}
		
		
	}

}
