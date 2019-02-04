import java.util.Scanner;

public class ccc03j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int s = sc.nextInt();
		sc.nextLine();
		int h = sc.nextInt();
		
		if (s==2){
			for (int i=0; i<t; i++) {
				System.out.println("*  *  *");
			}
			System.out.println("*******");
			for (int i=0; i<h; i++){
				System.out.println("   *");
			}

		} else if (s==3){
			for (int i=0; i<t; i++) {
				System.out.println("*   *   *");
		}
			System.out.println("*********");
			for (int i=0; i<h; i++){
				System.out.println("    *");
			}
		} else if (s==4){
			for (int i=0; i<t; i++) {
				System.out.println("*    *    *");
		}
			System.out.println("***********");
			for (int i=0; i<h; i++){
				System.out.println("     *");
			}
		} else if (s==5){
			for (int i=0; i<t; i++) {
				System.out.println("*     *     *");
		}
			System.out.println("*************");
			for (int i=0; i<h; i++){
				System.out.println("      *");
			}
		} else if (s==6){
			for (int i=0; i<t; i++) {
				System.out.println("*      *      *");
		}
			System.out.println("***************");
			for (int i=0; i<h; i++){
				System.out.println("       *");
			}
		} else if (s==7){
			for (int i=0; i<t; i++) {
				System.out.println("*       *       *");
		}
			System.out.println("*****************");
			for (int i=0; i<h; i++){
				System.out.println("        *");
			}
		} else if (s==8){
			for (int i=0; i<t; i++) {
				System.out.println("*        *        *");
		}
			System.out.println("*******************");
			for (int i=0; i<h; i++){
				System.out.println("         *");
			}
		} else if (s==9){
			for (int i=0; i<t; i++) {
				System.out.println("*         *         *");
		}
			System.out.println("*********************");
			for (int i=0; i<h; i++){
				System.out.println("          *");
			}
		} else if (s==10){
			for (int i=0; i<t; i++) {
				System.out.println("*          *          *");
		}			System.out.println("***********************");
		for (int i=0; i<h; i++){
			System.out.println("           *");
		}
		
		} else {
			for (int i=0; i<t; i++){
				System.out.println("***");
		}
			System.out.println("***");
			for (int i=0; i<h; i++){
				System.out.println(" *");
			}
		}
		
	}
	
}
