import java.util.Scanner;

public class ccc04j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] adj = new String[sc.nextInt()];
		String[] noun = new String[sc.nextInt()];
		sc.nextLine();
		for (int i=0; i<adj.length; i++){
			adj[i]=sc.nextLine();
		}
		for (int i=0; i<noun.length; i++){
			noun[i]=sc.nextLine();
		}

		for (int i=0; i<adj.length; i++){
			for (int l=0; l<noun.length; l++){
				System.out.println(adj[i]+" as "+noun[l]);
			}
		}



	}

}
