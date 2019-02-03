import java.util.LinkedList;
import java.util.Scanner;

public class ccc14j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n = sc.nextInt();
		sc.nextLine();
		String a1 = sc.nextLine();
		String[] A = a1.split(" ");
		String b1 = sc.nextLine();
		String[] B = b1.split(" ");
		
		LinkedList <String> a = new LinkedList <String>();
		LinkedList <String> b = new LinkedList <String>();
		
		for (int i=0; i<B.length; i++){
			a.add(A[i]);
			b.add(B[i]);
		}
		
		for (int i=0; i<a.size(); i++){
			String aa = a.get(i);
			String bb = b.get(i);
			if (aa.equals(bb)){
				flag = false;
				break;
			} else {
				int index = b.indexOf(aa);
				String partner = a.get(index);
				if (!partner.equals(bb)){
					flag = false;
					break;
				}
			}
			
		}

		
		if (flag){
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
		
		
		
	}

}
