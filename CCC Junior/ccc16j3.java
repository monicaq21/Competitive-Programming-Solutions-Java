import java.util.Scanner;

public class ccc16j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Hidden Palindrome
		String S = sc.next();
		int count = 0;
		
		for (int len=1; len<=S.length(); len++){
			for (int i=0; i<S.length()-len+1; i++){
				String s = S.substring(i,i+len);
				boolean flag = true;
				for (int l=0; l<s.length(); l++){
					if (s.charAt(l)!=s.charAt(s.length()-l-1)){
						flag=false;
					}
				}
				if (flag && s.length()>count){
					count = s.length();
				}
			}
		}
		System.out.print(count);
		
	}

}
