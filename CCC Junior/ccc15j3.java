import java.util.*;

public class ccc15j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Hashtable <Character, String> h = new Hashtable <Character, String>();

		String s = sc.next();
		String[] word = new String[s.length()];

		for (int i = 0; i < word.length; i++){
			if (!isVow(s.charAt(i))){
				char a = s.charAt(i);
				char b = a;
				int up = s.charAt(i);
				int down = s.charAt(i);
				boolean goup = false;
				boolean godown = false;
				
				while (true){
					up++;
					down--;
					
					if (up > 122){
						godown = true;
						break;
					}
					if (down < 97){
						goup = true;
						break;
					}
					
					char UP = (char)(up);
					char DOWN = (char)(down);
					
					if (isVow(DOWN) && isVow(UP)){
						if (DOWN < UP){
							b = DOWN;
							break;
						} else {
							b = UP;
							break;
						}
					} else if (isVow(UP)){
						b = UP;
						break;
					} else if (isVow(DOWN)){
						b = DOWN;
						break;
					}
				}
				
				if (b == a){
					if (goup){
						while (true){
							up++;
							if (isVow((char)up)){
								b = (char)up;
								break;
							}
						}
					} else {
						while (true){
							down--;
							if (isVow((char)down)){
								b = (char)down;
								break;
							}
						}
					}
				}
				
				char c = a;
				
				while (true){
					if (c == 'z'){
						c = 'z';
					} else {
						c = (char)(c + 1);
					}
					if (!isVow(c)) break;
				}
				
				word[i] = a + "" + b + "" + c;
				
			} else {
				word[i] = "" + s.charAt(i);
			}
		}
		
		for (int i = 0; i < word.length; i++){
			System.out.print(word[i]);
		}
	}
	
	public static boolean isVow(char c){
		if (c == 'i' || c == 'e' || c == 'a' || c == 'o' || c == 'u'){
			return true;
		} 
		return false;
	}

}
