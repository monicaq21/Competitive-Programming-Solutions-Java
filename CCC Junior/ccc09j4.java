import java.util.*;

public class ccc09j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] A = {"WELCOME","TO","CCC","GOOD","LUCK","TODAY"};
		
		LinkedList <String> l = new LinkedList<String>();
		int n = sc.nextInt(), total = 0;
		
		
		for (int i=0; i<A.length; i++){
			if (total==0){
				l.add(A[i]);
				total = A[i].length();
			} else if (total+A[i].length()+1<=n){
				l.add(A[i]);
				total += A[i].length()+1;
			} else {
				print(l,n);
				l.clear();
				l.add(A[i]);
				total = A[i].length();
			}
			if (i==A.length-1){
				print(l,n);
			}
		}
		
	}
	public static void print(LinkedList<String> l, int n){
		int size = l.size();
		if (size==1){
			System.out.print(l.get(0));
			for (int j=0; j<n-l.get(0).length();j++) {
				System.out.print(".");
			}
			System.out.println();
			return;
		}
		int total=0;
		for (int i=0; i<l.size(); i++){
			total+=l.get(i).length();
		}
		int dot = n-total;
		int dot1 = dot/(l.size()-1); 
		int dot2 = dot%(l.size()-1);
		for (int i=0; i<l.size(); i++){
			if (i!=0){
				int dot3 = dot1;
				if (i<=dot2){
					dot3++;
				}
				for (int k=0; k<dot3; k++){
					System.out.print(".");
				}
			}
			System.out.print(l.get(i));
		}
		System.out.println();
		
	}
	
}
