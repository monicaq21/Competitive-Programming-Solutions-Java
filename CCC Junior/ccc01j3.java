import java.util.*

public class ccc01j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] k = s.toCharArray();
		
		System.out.println("Cards Dealt Points");
		
		int index = 1, count = 0;
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
		
		System.out.print("Clubs ");
		while (k[index]!='D') {
			count++;
			if (k[index]=='A') p1+=4;
			else if (k[index]=='K') p1+=3;
			else if (k[index]=='Q') p1+=2;
			else if (k[index]=='J') p1+=1;
			System.out.print(k[index]+" ");
			index++;
		}
		index++;
		p1 += Math.max(3-count, 0);
		System.out.println(p1);
		count = 0;
		
		System.out.print("Diamonds ");
		while (k[index]!='H') {
			count++;
			if (k[index]=='A') p2+=4;
			else if (k[index]=='K') p2+=3;
			else if (k[index]=='Q') p2+=2;
			else if (k[index]=='J') p2+=1;
			System.out.print(k[index]+" ");
			index++;
		}
		index++;
		p2 += Math.max(3-count, 0);
		System.out.println(p2);
		count = 0;
		
		System.out.print("Hearts ");
		while (k[index]!='S') {
			count++;
			if (k[index]=='A') p3+=4;
			else if (k[index]=='K') p3+=3;
			else if (k[index]=='Q') p3+=2;
			else if (k[index]=='J') p3+=1;
			System.out.print(k[index]+" ");
			index++;
		}
		index++;
		p3 += Math.max(3-count, 0);
		System.out.println(p3);
		count = 0;
		
		System.out.print("Spades ");
		while (index!=k.length) {
			count++;
			if (k[index]=='A') p4+=4;
			else if (k[index]=='K') p4+=3;
			else if (k[index]=='Q') p4+=2;
			else if (k[index]=='J') p4+=1;
			System.out.print(k[index]+" ");
			index++;
		}
		p4 += Math.max(3-count, 0);
		System.out.println(p4);
		count = 0;
		
		System.out.println("Total "+(p1+p2+p3+p4));
		
		
		
	}
}
