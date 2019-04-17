import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class coci065p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String cur = sc.nextLine();
		String[] A = cur.split(":");
		int ch = Integer.parseInt(A[0]);
		int cm = Integer.parseInt(A[1]);
		int cs = Integer.parseInt(A[2]);
    
		String expl = sc.nextLine();
		String[] B = expl.split(":");
		int eh = Integer.parseInt(B[0]);
		int em = Integer.parseInt(B[1]);
		int es = Integer.parseInt(B[2]);

		if (ch == eh && cm == em && cs == es){
			System.out.println("24:00:00");
			return;
		}
    
		if (!smaller(ch, cm, cs, eh, em, es)){
			eh += 24;
		}
		
		if (es < cs){
			es += 60;
			em--;
		}
    
		int s = es - cs;
    
		if (em < cm){
			em += 60;
			eh--;
		}
    
		int m = em - cm;
		int h = eh - ch;
		System.out.printf("%02d:%02d:%02d", h, m, s);

	}

	public static boolean smaller(int ch, int cm, int cs, int eh, int em, int es){
		
		if (eh > ch){
			return true;
		} else if (eh < ch){
			return false;
		}
		
		if (em > cm){
			return true;
		} else if (em < cm){
			return false;
		}
		
		if (es > cs){
			return true;
		} else {
			return false;
		}
		
	}

}
