import java.util.Scanner;

public class ccc10j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(),
				b = sc.nextInt(),
				c = sc.nextInt(),
				d = sc.nextInt(),
				s = sc.nextInt();
		
		int n1 = s/(a+b);
		n1 = n1*(a-b);
		int n2 = s%(a+b);
		
		if (n2<=a){
			n1+=n2;
		} else {
			n1+=n2-(n2-a);
		}
		
		int b1 = s/(c+d);
		b1 = b1*(c-d);
		int b2 = s%(c+d);
		
		if (b2<=c){
			b1+=b2;
		} else {
			b1+=b2-(b2-c);
		}
		
		if (b1>n1){
			System.out.println("Byron");
		} else if (b1==n1){
			System.out.println("Tied");
		} else {
			System.out.println("Nikky");
		}
		
		
		
		
	}

}
