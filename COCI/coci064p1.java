import java.util.*;

public class coci064p1 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
    
		double max = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		for (int i=0; i<n; i++){
			
			int a = sc.nextInt();
      
			if (a <= max){
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}

		}
	}
}
