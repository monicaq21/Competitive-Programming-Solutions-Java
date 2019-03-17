import java.util.*;

public class ccc11j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = 195;
		int c = 199;
		boolean[][] d = new boolean[200][401];
		
		d[199][200] = true;
		d[198][200] = true;
		d[197][200] = true;
		d[197][201] = true;
		d[197][202] = true;
		d[197][203] = true;
		d[197][205] = true;
		d[197][206] = true;
		d[197][207] = true;
		d[196][203] = true;
		d[196][205] = true;
		d[196][207] = true;
		d[195][199] = true;
		d[195][203] = true;
		d[195][204] = true;
		d[195][205] = true;
		d[195][207] = true;
		d[194][199] = true;
		d[194][207] = true;
    
		for (int i = 199; i <= 207; i++){
			d[193][i] = true;
		}
		
		while (true) {
			String s = sc.nextLine();
			if (s.contains("q ")) break;
			
			String[] k = s.split(" ");
			int n = Integer.parseInt(k[1]);
			if (s.contains("l ")){
				int C = c;
				for (int i = C - 1; i >= C - n; i--){
					c--;
					if (d[r][i]){
						System.out.println(((C - n) - 200) + " " + (r - 200) + " DANGER");
						return;
					} else {
						d[r][i] = true;
					}
				}
				System.out.println((c - 200) + " " + (r - 200) + " safe");
				
			} else if (s.contains("r ")){
				int C = c;
				for (int i = C + 1; i <= C + n; i++){
					c++;
					if (d[r][i]){
						System.out.println(((C + n) - 200) + " " + (r - 200) + " DANGER");
						return;
					} else {
						d[r][i] = true;
					}
				}
				System.out.println((c - 200) + " " + (r - 200) + " safe");
				
			} else if (s.contains("u ")){
				int R = r;
				for (int i = R + 1; i <= R + n; i++){
					r++;
					if (d[i][c]){
						System.out.println((c - 200) + " " + ((R + n) - 200) + " DANGER");
						return;
					} else {
						d[i][c] = true;
					}
				}
				System.out.println((c - 200) + " " + (r - 200) + " safe");
			} else {
				int R = r;
				for (int i = R - 1; i >= R - n; i--){
					r--;
					if (d[i][c]){
						System.out.println((c - 200) + " " + ((R - n) - 200) + " DANGER");
						return;
					} else {
						d[i][c] = true;
					}
				}
				System.out.println((c - 200) + " " + (r - 200) + " safe");
			} 
			
		}
		
	}

}
