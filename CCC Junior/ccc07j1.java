import java.util.Scanner;

public class ccc07j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int AA = sc.nextInt(),
				BB = sc.nextInt(),
				CC = sc.nextInt();
		
		if ((AA < BB && AA > CC) || (AA < CC && AA > BB)){
			System.out.println(AA);
		} else if ((BB < AA && BB > CC) || (BB < CC && BB > AA)){
			System.out.println(BB);
		} else if ((CC < BB && CC > AA) || (CC < AA && CC > BB)){
			System.out.println(CC);
		}
		
	}
	
}
