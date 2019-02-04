import java.util.*;

public class ccc00j4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList <Integer> l = new LinkedList <Integer>();
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++){
			int k = sc.nextInt();
			l.add(k);
		}
		
		while (true){
			int a = sc.nextInt();
			if (a==77){
				for (int i=0; i<l.size(); i++) {
					System.out.print(l.get(i)+" ");
				}
				break;
			} else if (a==99) {
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				double left = (c/100.0)*l.get(b);
				l.add(b+1, l.get(b)-(int)left);
				l.set(b, (int)left);
			} else {
				int b = sc.nextInt()-1;
				l.set(b, l.get(b)+l.get(b+1));
				l.remove(b+1);
			}
		}
		
		


	}

}
