import java.util.*;

public class coci072p1 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int kings = sc.nextInt();
		int queens = sc.nextInt();
		int rooks = sc.nextInt();
		int bishops = sc.nextInt();
		int knights = sc.nextInt();
		int pawns = sc.nextInt();
		
		System.out.println((1 - kings) + " " + (1 - queens) + " " + (2 - rooks) + " " + 
				   (2 - bishops) + " " + (2 - knights) + " " + (8 - pawns));
		
		
	}
}
