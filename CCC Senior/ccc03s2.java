import java.util.Scanner;

public class ccc03s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++){
			String[] w = new String[4];
			for (int l=0; l<4; l++){
				String s = sc.nextLine();
				String[] t = s.split(" ");
				s = t[t.length-1].toLowerCase();
				for (int q=s.length()-1; q>=0; q--){
					if (s.charAt(q)=='a'||s.charAt(q)=='e'||s.charAt(q)=='i'||s.charAt(q)=='o'||s.charAt(q)=='u'){
						s = s.substring(q, s.length());
						break;
					}
				}
				w[l] = s;
			}

			if (w[0].equals(w[1])&&w[1].equals(w[2])&&w[2].equals(w[3])){
				System.out.println("perfect");
			} else if (w[0].equals(w[1])&&w[2].equals(w[3])){
				System.out.println("even");
			} else if (w[0].equals(w[2])&&w[1].equals(w[3])){
				System.out.println("cross");
			} else if (w[0].equals(w[3])&&w[1].equals(w[2])){
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}
		
		
	}

}
