import java.util.Scanner;

public class ccc08j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[] k = {'A','B','C','D','E'};

		while (true){
			int button = sc.nextInt(), n = sc.nextInt();
			if (button==4) break;
			else{
				if (button==1) b1(n,k);
				else if (button==2) b2(n,k);
				else if (button==3) b3(n,k);
			}
		}
    
		for (char c: k){
			System.out.print(c+" ");
		}

	}

	public static char[] b1 (int n, char[] k){
		for (int i=0; i<n; i++){
			char a = k[0];
			k[0]=k[1];
			k[1]=k[2];
			k[2]=k[3];
			k[3]=k[4];
			k[4]=a;
		}
		return k;


	}

	public static char[] b2 (int n, char[] k){
		for (int i=0; i<n; i++){
			char a = k[4];
			k[4]=k[3];
			k[3]=k[2];
			k[2]=k[1];
			k[1]=k[0];
			k[0]=a;
		}
		return k;


	}
	
	public static char[] b3 (int n, char[] k){
		for (int i=0; i<n; i++){
			char a = k[0];
			k[0]=k[1];
			k[1]=a;
		}
		return k;


	}

}
