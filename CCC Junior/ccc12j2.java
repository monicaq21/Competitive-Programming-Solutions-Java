import java.util.Scanner;
public class ccc12j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int depth1 = sc.nextInt();
		int depth2 = sc.nextInt();
		int depth3 = sc.nextInt();
		int depth4 = sc.nextInt();
		if (depth1<depth2 && depth2<depth3 && depth3<depth4){
			System.out.println("Fish Rising");
		} else if (depth1>depth2 && depth2>depth3 && depth3>depth4){
			System.out.println("Fish Diving");
		} else if (depth1==depth2 && depth2==depth3 && depth3==depth4){
			System.out.println("Fish At Constant Depth");
		} else{
			System.out.println("No Fish");
		}
	}

}
