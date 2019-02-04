import java.util.Scanner;

public class ccc02j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true){
			String k = sc.nextLine();
			if (k.equals("quit!")) break;
			if (!k.equals("quit!")){
				if (k.length()>4 &&k.charAt(k.length()-2)=='o' && k.charAt(k.length()-1)=='r' ){
					char b = k.charAt(k.length()-3);
					if (b!='a'&&b!='u'&&b!='o'&&b!='i'&&b!='e'&&b!='y'){
						System.out.println(k.replace("or", "our"));
					} else {
						System.out.println(k);
					}
				} else {
					System.out.println(k);
				} 
			}




		}

	}
}
