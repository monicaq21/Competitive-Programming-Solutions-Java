import java.util.*;

public class ccc08s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.MAX_VALUE;
		String p = "";
		LinkedList <String> city = new LinkedList <String>(); 
		LinkedList <Integer> temp = new LinkedList <Integer>();
		
		while (true){
			String s = sc.next();
			int n = sc.nextInt();
			
			if (s.equals("Waterloo")){
				temp.add(n);
				if (n < k){
					k = n;
					p = "" + s;
				}
				break;
			}
			
			city.add(s);
			temp.add(n);
			
			if (n < k){
				k = n;
				p = "" + s;

			}

			
		}
		
		System.out.println(p);
		
	}

}
