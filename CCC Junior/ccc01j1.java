import java.util.Scanner;

public class ccc01j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tie = sc.nextInt();
		for (int b=tie; b>1; b=b-2){
			for (int i=b; i<=tie; i++){
				System.out.print("*");
			}
			for (int i=(b*2-3); i>=0; i--){
			System.out.print(" ");
			}
			for (int i=b; i<=tie; i++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int b=1; b<=tie; b=b+2){
			for (int i=b; i<=tie; i++){
				System.out.print("*");
			}
      
			for (int i=0; i<(b-1)*2; i++){
			System.out.print(" ");
			}
			for (int i=b; i<=tie; i++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}
		
		
}
