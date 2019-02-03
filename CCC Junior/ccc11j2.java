import java.util.Scanner;

public class ccc11j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		boolean flag = true;
		
		for (int i=1; i<=m; i++){
			double a =-6*Math.pow(i, 4)+Math.pow(i,3)*h+Math.pow(i, 2)*2+i;
			if (a<=0){
				System.out.println("The balloon first touches ground at hour: ");
				System.out.println(i);
				flag=false;
				break;
			}
		}
		
		
		if (flag){
			System.out.println("The balloon does not touch ground in the given time.");
		}
		
	}

}
