import java.util.Scanner;

public class wc171j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int apoint = 0;
		int bpoint = 0;
		
		int[] a = new int[7];
		int[] b = new int[7];
		
		for (int i=0; i<7; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for (int i=0; i<7; i++){
			if (a[i]>b[i]){
				apoint++;
			} else{
				bpoint++;
			}
			if (apoint==4 || bpoint==4){
				break;
			}
			
		}
		
		System.out.println(apoint+" "+bpoint);
		
		
	}

}
