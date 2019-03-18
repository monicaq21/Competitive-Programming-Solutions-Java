import java.util.Scanner;

public class ccc16j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[4][4];
		boolean flag = true;
		
		for (int col = 0; col < 4; col++){
			for (int row = 0; row < 4; row++){
				a[col][row] = sc.nextInt();
			}
		}
		
		int number = a[0][1] + a[0][2] + a[0][3] + a[0][0];
		
		for (int col = 0; col < 4; col++){
			if (a[col][1] + a[col][2] + a[col][3] + a[col][0] != number){
				flag = false;
			}
			if (a[1][col] + a[2][col] + a[3][col] + a[0][col] != number){
				flag = false;
			}
		}
		
		if (flag == true){
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
	}

}
