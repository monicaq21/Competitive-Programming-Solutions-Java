import java.util.*;

public class ccc05s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int r = sc.nextInt();
		
		LinkedList <Integer> x = new LinkedList <Integer>();
		LinkedList <Integer> y = new LinkedList <Integer>();
    
		while (true){
			int xc = sc.nextInt();
			int yc = sc.nextInt();
			if (xc==0 && yc==0){
				break;
			} else {
				x.add(xc);
				y.add(yc);
			}
		}
		
		int a = 0;
		int b = 0;
		
		while (!x.isEmpty()){
			a+=x.pop();
			b+=y.pop();
			
			if (a<0){
				a=0;
			} else if (a>c){
				a=c;
			}
			if (b<0){
				b=0;
			} else if (b>r){
				b=r;
			}
			
			System.out.println(a+" "+b);
		}
		
		
		
	}

}
