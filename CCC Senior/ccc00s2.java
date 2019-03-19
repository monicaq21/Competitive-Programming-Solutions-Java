import java.util.*;

public class ccc00s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		LinkedList<Double> map = new LinkedList<Double>();
		
		for (int i = 0; i < n; i++) {
			map.add(sc.nextDouble());
		}
		
		while (true) {
			int instruc = sc.nextInt();
			if (instruc == 77) break;
			
			if (instruc == 99) {
				int index = sc.nextInt() - 1;
				double left = sc.nextDouble() / 100.0;
				double right = 1 - left;
				double curvalue = map.get(index);
				map.set(index, left * curvalue);
				map.add(index + 1, right * curvalue);
			} else {
				int index = sc.nextInt() - 1;
				map.set(index, map.get(index) + map.remove(index + 1));
			}
		}
		
		for (double w: map) {
			System.out.print((int)(Math.round(w)) + " ");
		}
		System.out.println();
		
	}
}
