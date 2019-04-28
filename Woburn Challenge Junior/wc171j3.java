import java.util.Scanner;

public class wc171j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int aPoint = 0;
		int bPoint = 0;
		
		int[] a = new int[7];
		int[] b = new int[7];
		
		for (int i=0; i<7; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for (int i=0; i<7; i++){
			if (a[i] > b[i]){
				aPoint++;
			} else{
				bPoint++;
			}
			if (aPoint == 4 || bPoint == 4){
				break;
			}
			
		}
		
		System.out.println(aPoint + " " + bPoint);
		
		
	}

}
