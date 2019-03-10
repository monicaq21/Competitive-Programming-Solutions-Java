import java.util.*;

public class coci066p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int warnings = 0;
		LinkedList<String> name = new LinkedList<String>();
		LinkedList<Integer> times = new LinkedList<Integer>();
    
		for (int i=0; i<n; i++) {
			String s = sc.next();
			if (!name.contains(s)) {
				name.add(s);
				times.add(1);
			} else {
				int index = name.indexOf(s);
				if (times.get(index)>(i-times.get(index))){
					warnings++;
				}
				times.set(index, times.get(index)+1);
				
			}
		}
    
		System.out.println(warnings);


	}
}
