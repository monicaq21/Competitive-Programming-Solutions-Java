import java.util.*;

public class ccc06j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer>[] map = new ArrayList[7];
		for (int i=0; i<7; i++){
			map[i] = new ArrayList<Integer>();
		}
		map[6].add(0); map[3].add(0); map[0].add(1); map[3].add(2); map[4].add(2);

		boolean[] tasks = new boolean[7];

		LinkedList<Integer> w = new LinkedList<Integer>();

		while (true){
			int x = sc.nextInt(), y = sc.nextInt();
			if (x==0&&y==0){
				break;
			}
			map[y-1].add(x-1);
		}

		while (true){
			boolean flag = false;
			for (int i=0; i<7; i++){
				if (!tasks[i]&&map[i].isEmpty()){
					tasks[i] = true;
					w.add(i+1);
					for (int l=0; l<7; l++){
						if (map[l].contains(i)){
							map[l].remove(map[l].indexOf(i));
						}
					}
					flag = true;
					break;
				}
			}
			if (flag) continue;
			break;
		}

		if (w.size()<7) System.out.println("Cannot complete these tasks. Going to bed.");
		else {
			for (int i: w){
				System.out.print(i+" ");
			}
		}



	}

}
