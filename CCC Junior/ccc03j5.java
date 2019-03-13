import java.util.*;

public class ccc03j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int wood = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		char[][] map = new char[r][c];
		boolean[][] visited = new boolean[r][c];
		LinkedList<Integer> area = new LinkedList<Integer>();
		
		for (int i = 0; i < r; i++){
			String s = sc.next();
			map[i] = s.toCharArray();
		}
		
		for (int i = 0; i < r; i++){
			for (int l = 0; l < c; l++){
				if (map[i][l] == '.' && !visited[i][l]){
					area.add(dfs(0, map, visited, i, l, r, c));
				}
			}
		}
		
		Collections.sort(area);
		int j = area.size() - 1;
		int count = 0;
		
		while (true) {
			if (j < 0){
				if (count == 1){
					System.out.println("1 room, " + wood + " square metre(s) left over");
					break;
				}
				System.out.println(count + " rooms, " + wood + " square metre(s) left over");
				break;
			}
			int left = wood - area.get(j);
			if (left < 0){
				if (count == 1){
					System.out.println("1 room, " + wood + " square metre(s) left over");
					break;
				}
				System.out.println(count + " rooms, " + wood + " square metre(s) left over");
				break;
			}
			count++;
			j--;
			wood = left;
		}
		
	}
	
	public static int dfs(int count, char[][] map, boolean[][] visited, int i, int l, int r, int c){
		if (i < 0 || l < 0 || i >= r || l >= c || visited[i][l] || map[i][l] != '.'){
			return 0;
		} else {
			visited[i][l] = true;
			return dfs(count, map, visited, i + 1, l, r, c) +
			dfs(count, map, visited, i - 1, l, r, c) +
			dfs(count, map, visited, i, l + 1, r, c) +
			dfs(count, map, visited, i, l - 1, r, c) +
			1;
		}
	}
}
