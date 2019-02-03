import java.util.*;

public class ccc10j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[8][8];
		
		for (int row=0; row<8; row++){
			for (int col=0; col<8; col++){
				a[col][row]=Integer.MAX_VALUE;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int br = sc.nextInt()-1;
		int bc = sc.nextInt()-1;
		int er = sc.nextInt()-1;
		int ec = sc.nextInt()-1;

		LinkedList <Integer> rowQ = new LinkedList <Integer>();
		LinkedList <Integer> colQ = new LinkedList <Integer>();

		rowQ.add(br);
		colQ.add(bc);
		a[br][bc]=0;

		while (!rowQ.isEmpty()){
			int row = rowQ.poll();
			int col = colQ.poll();

			if (row-2>=0 && col+1<8 && a[row-2][col+1]>a[row][col]+1){
				a[row-2][col+1] = a[row][col]+1;
				rowQ.add(row-2);
				colQ.add(col+1);
			}
			if (row-2>=0 && col-1>=0 && a[row-2][col-1]>a[row][col]+1){
				a[row-2][col-1] = a[row][col]+1;
				rowQ.add(row-2);
				colQ.add(col-1);
			}
			if (row-1>=0 && col+2<8 && a[row-1][col+2]>a[row][col]+1){
				a[row-1][col+2] = a[row][col]+1;
				rowQ.add(row-1);
				colQ.add(col+2);
			}
			if (row-1>=0 && col-2>=0 && a[row-1][col-2]>a[row][col]+1){
				a[row-1][col-2] = a[row][col]+1;
				rowQ.add(row-1);
				colQ.add(col-2);
			}
			if (row+2<8 && col+1<8 && a[row+2][col+1]>a[row][col]+1){
				a[row+2][col+1] = a[row][col]+1;
				rowQ.add(row+2);
				colQ.add(col+1);
			}
			if (row+2<8 && col-1>=0 && a[row+2][col-1]>a[row][col]+1){
				a[row+2][col-1] = a[row][col]+1;
				rowQ.add(row+2);
				colQ.add(col-1);
			}
			if (row+1<8 && col+2<8 && a[row+1][col+2]>a[row][col]+1){
				a[row+1][col+2] = a[row][col]+1;
				rowQ.add(row+1);
				colQ.add(col+2);
			}
			if (row+1<8 && col-2>=0 && a[row+1][col-2]>a[row][col]+1){
				a[row+1][col-2] = a[row][col]+1;
				rowQ.add(row+1);
				colQ.add(col-2);
			}

		}
		if (rowQ.isEmpty()){
			System.out.println(a[er][ec]);
		}



	}

}
