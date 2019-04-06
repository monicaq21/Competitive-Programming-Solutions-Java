import java.util.*;

public class p307ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		for (int w = 0; w < t; w++) {
			
			int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
			
			int ans = 0;
			
			switch (m) {
			case 1:
				ans = d;
				break;
			case 2:
				ans = d + 31;
				break;
			case 3:
				ans = d + 59;
				break;
			case 4:
				ans = d + 90;
				break;
			case 5:
				ans = d + 120;
				break;
			case 6:
				ans = d + 151;
				break;
			case 7:
				ans = d + 181;
				break;
			case 8:
				ans = d + 212;
				break;
			case 9:
				ans = d + 243;
				break;
			case 10:
				ans = d + 273;
				break;
			case 11:
				ans = d + 304;
				break;
			default:
				ans = d + 334;
			}
			
			if (y % 4 == 0 && m > 2) ans++;
			
			System.out.println(ans);
			
		}
		
		
	}
}
