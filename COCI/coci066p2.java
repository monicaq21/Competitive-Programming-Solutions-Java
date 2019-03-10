import java.util.*;

public class coci066p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
    
		char[][] map = new char[r][c];
    
		for (int i=0; i<r; i++){
			String s = sc.nextLine();
			map[i] = s.toCharArray();
		}
    
		char[][] map2 = new char[r*2][c*2];

		int x = sc.nextInt()-1, y = sc.nextInt()-1;
    
		for (int i=0; i<r; i++){
			for(int l=0; l<c; l++){
				map2[i][l] = map[i][l];
			}
			for (int l=c-1; l>=0; l--){
				map2[i][c+(c-l-1)] = map[i][l];
			}
		}
    
    
		for (int i=r-1; i>=0; i--){
			for(int l=0; l<c; l++){
				map2[r+(r-i-1)][l] = map[i][l];
			}
			for (int l=c-1; l>=0; l--){
				map2[r+(r-i-1)][c+(c-l-1)] = map[i][l];
			}
		}
    
    
		if (map2[x][y]=='.') map2[x][y] = '#';
		else map2[x][y] = '.';
    
		for (int i=0; i<r*2; i++){
			for (int l=0; l<c*2; l++){
				System.out.print(map2[i][l]);
			}
			System.out.println();
		}


	}
}
