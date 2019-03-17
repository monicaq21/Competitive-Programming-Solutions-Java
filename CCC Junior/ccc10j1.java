import java.util.Scanner;

public class ccc10j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i <= 5; i++){
			for (int l = 0; l <= 5; l++){
				if (i + l == a && i <= l) count++;
			}
		}
		
		System.out.println(count++);

	}
}
