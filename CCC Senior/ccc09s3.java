import java.util.*;

public class ccc09s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean[][] map = new boolean[51][51];
		map[2][6]=true;	map[6][2]=true;
		map[1][6]=true;	map[6][1]=true;
		map[7][6]=true;	map[6][7]=true;
		map[4][6]=true;	map[6][4]=true;
		map[5][6]=true;	map[6][5]=true;
		map[3][6]=true;	map[6][3]=true;
		map[3][5]=true;	map[5][3]=true;
		map[3][4]=true;	map[4][3]=true;
		map[4][5]=true;	map[5][4]=true;
		map[3][15]=true;	map[15][3]=true;
		map[15][13]=true;	map[13][15]=true;
		map[12][13]=true;	map[13][12]=true;
		map[13][14]=true;	map[14][13]=true;
		map[18][16]=true;	map[16][18]=true;
		map[17][16]=true;	map[16][17]=true;
		map[17][18]=true;	map[18][17]=true;
		map[12][11]=true;	map[11][12]=true;
		map[12][9]=true;	map[9][12]=true;
		map[11][10]=true;	map[10][11]=true;
		map[10][9]=true;	map[9][10]=true;
		map[9][8]=true;	map[8][9]=true;
		map[7][8]=true;	map[8][7]=true;

		while (true){
			String s = sc.nextLine();
			if (s.equals("q")){
				break;
			}
			if (s.equals("i")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = true;
				map[y][x] = true;
				sc.nextLine();
				continue;
			}
			if (s.equals("d")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = false;
				map[y][x] = false;
				sc.nextLine();
				continue;
			}
			if (s.equals("n")){
				int x = sc.nextInt();
				int count = 0;
				for (int i=1; i<51; i++){
					if (map[x][i]){
						count++;
					}
				}
				System.out.println(count);
				continue;
			}
			if (s.equals("f")){
				LinkedList<Integer> l = new LinkedList<Integer>();
				LinkedList<Integer> l2 = new LinkedList<Integer>();
				LinkedList<Integer> l3 = new LinkedList<Integer>();
				int x = sc.nextInt();
				for (int i=1; i<51; i++){
					if (map[x][i]){
						l.add(i);
					}
				}
				for (int w=0; w<l.size(); w++){
					int n = l.get(w);
					for (int i=1; i<51; i++){
						if (map[n][i]&&i!=x&&!l.contains(i)){
							l2.add(i); //2nd friends
						}
					}
				}
				for (int i=0; i<l2.size(); i++){
					if (!l3.contains(l2.get(i))){
						l3.add(l2.get(i));
					}
				}


				System.out.println(l3.size());
			}

			if (s.equals("s")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				LinkedList<Integer> queue=new LinkedList<Integer>();
				queue.add(x);
				int[] steps = new int[51];
				Arrays.fill(steps, Integer.MAX_VALUE);
				steps[x]=0;

				
				
				
				int r = p(map,queue,steps,y);
				if (r==-1){
					System.out.println("Not connected");
				} else {
					System.out.println(r);
				}
				
			}


		}


	}
	public static int p(boolean[][] map,LinkedList<Integer>queue,int[] steps, int y){
		while (!queue.isEmpty()){
			int n = queue.poll();
			for (int i=1; i<51; i++){
				if (map[n][i]&&steps[n]+1<steps[i]){
					if (i==y){
						return steps[n]+1;
					}else {
						queue.add(i);
						steps[i]=steps[n]+1;
					}
				}
			}
		}
		return -1;

	}

}
