import java.util.*;

public class coci063p1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		int total = 0;
		
		for (int i=0; i<9; i++){
			a[i] = sc.nextInt();
			total += a[i];
		}
		
		int more = total - 100;
		
		for (int i=0; i<9; i++){
			for (int l=0; l<9; l++){
				if (a[i] + a[l] == more && a[i] != 0 && a[l] != 0){
					if (i != l){
						a[i] = 0;
						a[l] = 0;
						break;
					}
				}
			}
		}
		
		for (int i=0; i<9; i++){
			if (a[i] != 0){
				System.out.println(a[i]);
			}
		}
	}

}
