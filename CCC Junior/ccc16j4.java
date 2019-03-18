import java.util.Scanner;

public class ccc16j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] S = s.split(":");
		int h = Integer.parseInt(S[0]);
		int m = Integer.parseInt(S[1]);
		double d = 0;

		while (true){
			if (h == 7 || h == 8 || h == 9 || h == 15 || h == 16 || h == 17 || h == 18){
				d += 0.5;
			} else {
				d += 1;
			}
			
			m += 1;
			if (m == 60){
				m = 0;
				h++;
				if (h == 24){
					h = 0;
				}
			}
			
			if (d >= 120){
				System.out.printf("%02d:%02d", h, m);
				break;
			}
		}



	}

}
