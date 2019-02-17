import java.util.*;

public class ccc16s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		LinkedList<Character> a = new LinkedList<Character>();
		LinkedList<Character> b = new LinkedList<Character>();
    boolean flag = true;

		for (int i=0; i<A.length(); i++){
			a.add(A.charAt(i));
			b.add(B.charAt(i));
		}


		for (int i=0; i<A.length(); i++){
			char c = a.get(i);
			int index = b.indexOf(c);
			if (index!=-1){
				b.remove(index);
			} else {
				int index2 = b.indexOf('*');
				if (index2!=-1){
					b.remove(index2);
				} else{
					flag=false;
					break;
				}
			}
		}


		if (flag==false){
			System.out.println("N");
		} else{
			System.out.println("A");
		}



	}
}
