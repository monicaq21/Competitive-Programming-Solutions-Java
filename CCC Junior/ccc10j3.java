import java.util.*;

public class ccc10j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a =0, b =0;
    
		while (true){
			String s = sc.nextLine();
			if (s.startsWith("7")){
				return;
			} else if (s.startsWith("1")){
				String[] t = s.split(" ");
				if (t[1].equals("A")){
					if (!s.contains("-")){
						int ww = Integer.parseInt(t[2]);
						a=ww;
					} else {
						t[2]=t[2].replace("-", "");
						int ww = Integer.parseInt(t[2]);
						a=ww*(-1);
					}
				} else {
					if (!s.contains("-")){
						int ww = Integer.parseInt(t[2]);
						b=ww;
					} else {
						t[2]=t[2].replace("-", "");
						int ww = Integer.parseInt(t[2]);
						b=ww*(-1);
					}
				}

			} else if (s.startsWith("2")){
				if (s.charAt(2)=='A'){
					System.out.println(a);
				} else {
					System.out.println(b);
				}
			} else if (s.startsWith("3")){
				if (s.charAt(2)=='A'){
					if (s.charAt(4)=='B'){
						a+=b;
					} else{
						a*=2;
					}
				} else {
					if (s.charAt(4)=='A'){
						b+=a;
					} else{
						b*=2;
					}
				}
			} else if (s.startsWith("4")){
				if (s.charAt(2)=='A'){
					if (s.charAt(4)=='B'){
						a*=b;
					} else{
						a*=a;
					}
				} else {
					if (s.charAt(4)=='B'){
						b*=b;
					} else{
						b*=a;
					}
				}
			} else if (s.startsWith("5")){
				if (s.charAt(2)=='A'){
					if (s.charAt(4)=='B'){
						a-=b;
					} else{
						a=0;
					}
				} else {
					if (s.charAt(4)=='B'){
						b=0;
					} else{
						b-=a;
					}
				}
			} else{
				if (s.charAt(2)=='A'){
					if (s.charAt(4)=='B'){
						a=(int)(a/b);
					} else{
						a=1;
					}

				} else {
					if (s.charAt(4)=='B'){
						b=1;
					} else{
						b=(int)(b/a);
					}
				}

			}

		}

	}

}
