import java.util.*;

public class ccc07s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int size = sc.nextInt();
		int[][] sizes = new int[size][3];
		int[] sizestotal = new int[size];

		for (int i=0; i<size; i++){
			int a11 = sc.nextInt();
			int a22 = sc.nextInt();
			int a33 = sc.nextInt();
			sizestotal[i] = a11*a22*a33;
			sizes[i][0] = a11;
			sizes[i][1] = a22;
			sizes[i][2] = a33;
			Arrays.sort(sizes[i]);
		}

		int m = sc.nextInt();
		int[][] box = new int[m][3];
		int[] boxestotal = new int[m];
		for (int i=0; i<m; i++){
			int aa = sc.nextInt();
			int bb = sc.nextInt();
			int cc = sc.nextInt();
			box[i][0] = aa;
			box[i][1] = bb;
			box[i][2] = cc;
			boxestotal[i] = aa*bb*cc;
			Arrays.sort(box[i]);
		}

		for (int i=0; i<m; i++){
			int min = Integer.MAX_VALUE;
			for (int l=0; l<size; l++){
				if (boxestotal[i]<=sizestotal[l]){
					if (box[i][0]<=sizes[l][0] && box[i][1]<=sizes[l][1] && box[i][2]<=sizes[l][2]){
						int volume = sizes[l][0]*sizes[l][1]*sizes[l][2];
						if (volume<min){
							min=volume;
						}
					}
				}
			}
			if (min==Integer.MAX_VALUE){
				System.out.println("Item does not fit.");
			} else {
				System.out.println(min);
			}

		}
	}
}
