package contest_questions;

import java.io.*;
import java.util.*;

public class ccc99s4 {

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();

		int t = sc.nextInt();

		for (int w=0; w<t; w++){
			int r=sc.nextInt(),c=sc.nextInt(),pr=sc.nextInt()-1,
					pc=sc.nextInt()-1,kr=sc.nextInt()-1,kc=sc.nextInt()-1;
			int[][] kstep = new int[r][c], pstep = new int[r][c];
			for (int i=0; i<r; i++){
				Arrays.fill(kstep[i], 1<<30);
				Arrays.fill(pstep[i], 1<<30);
			}
			kstep[kc][kr] = 0;
			pstep[pc][pr] = 0;
			LinkedList<Integer> kx = new LinkedList<Integer>(),
					ky = new LinkedList<Integer>(),
					px = new LinkedList<Integer>(),
					py = new LinkedList<Integer>();
			while (true){
				boolean flag = true;
				if (!kx.isEmpty()){
					flag = false;
					int x = kx.poll();
					int y = ky.poll();
					if (x+1<r&&y+2<c&&kstep[x+1][y+2]>kstep[x][y]+1){
						kstep[x+1][y+2] = kstep[x][y]+1;
						kx.add(x+1); ky.add(y+2);
					}
					if (x-1>=0&&y+2<c&&kstep[x-1][y+2]>kstep[x][y]+1){
						kstep[x-1][y+2] = kstep[x][y]+1;
						kx.add(x-1); ky.add(y+2);
					}
					if (x+1<r&&y-2>=0&&kstep[x+1][y-2]>kstep[x][y]+1){
						kstep[x+1][y-2] = kstep[x][y]+1;
						kx.add(x+1); ky.add(y-2);
					}
					if (x-1>=0&&y-2>=0&&kstep[x-1][y-2]>kstep[x][y]+1){
						kstep[x-1][y-2] = kstep[x][y]+1;
						kx.add(x-1); ky.add(y-2);
					}
					if (x+2<r&&y+1<c&&kstep[x+2][y+1]>kstep[x][y]+1){
						kstep[x+2][y+1] = kstep[x][y]+1;
						kx.add(x+2); ky.add(y+1);
					}
					if (x-2>=0&&y+1<c&&kstep[x-2][y+1]>kstep[x][y]+1){
						kstep[x-2][y+1] = kstep[x][y]+1;
						kx.add(x-2); ky.add(y+1);
					}
					if (x+2<r&&y-1>=0&&kstep[x+2][y-1]>kstep[x][y]+1){
						kstep[x+2][y-1] = kstep[x][y]+1;
						kx.add(x+2); ky.add(y-1);
					}
					if (x-2>=0&&y-1>=0&&kstep[x-2][y-1]>kstep[x][y]+1){
						kstep[x-2][y-1] = kstep[x][y]+1;
						kx.add(x-2); ky.add(y-1);
					}
				}
				if (!px.isEmpty()){
					flag = false;
					int x = kx.poll();
					int y = ky.poll();
					if (x-1>=0){
						px.add(x-1);
						py.add(y);
						pstep[x-1][y] = pstep[x][y]+1;
					}
				}
				if (flag) break;

			}
			int y = pc;
			boolean flag2 = true;
			for (int x=pr; x>=0; x--){
				if (kstep[x][y]<=pstep[x][y]){
					System.out.println("Win in "+kstep[x][y]+" knight move(s).");
					flag2 = false; break;
				} else if (x>0&&kstep[x-1][y]==pstep[x][y]){
					System.out.println("Stalemate in "+kstep[x][y]+" knight move(s).");
					flag2 = false; break;
				}
			}
			if (flag2) System.out.println("Loss in "+(r-pstep[pr][y])+" knight move(s).");

		}

	}


}

