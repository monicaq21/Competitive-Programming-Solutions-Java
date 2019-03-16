import java.util.LinkedList;
import java.util.Scanner;

public class ccc07j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList <String> l = new LinkedList <String>();

		while (true){
			String s = sc.nextLine();
			l.add(s);
			if (s.equals("TTYL")) break;
		}

		for (String k: l){
			k=k.replace("CU", "see you");
			k=k.replace(":-)", "I'm happy");
			k=k.replace(":-(", "I'm unhappy");
			k=k.replace(";-)", "wink");
			k=k.replace(":-P", "stick out my tongue");
			k=k.replace("(~.~)", "sleepy");
			k=k.replace("TA", "totally awesome");
			k=k.replace("CCC", "Canadian Computing Competition");
			k=k.replace("CUZ", "because");
			k=k.replace("TY", "thank-you");
			k=k.replace("YW", "you're welcome");
			k=k.replace("Tthank-youL", "talk to you later");
			
			System.out.println(k);
		} 


	}
}
