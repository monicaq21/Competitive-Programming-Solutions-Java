import java.io.*;

public class ccc17j4 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int h = 12, m = 0;
		int t = Integer.parseInt(bf.readLine());
		int count = 0;
		
		if (t >= 720){
			int a = t / 720;
			t = t % 720;
			count = a * 31;
		}
    
		for (int i = 0; i < t; i++){
			m++;
			
			if (m == 60){
				m = 0;
				h++;
			}
			if (h > 12){
				h -= 12;
			}
			
			String s = "";
			if (m < 10){
				s = h + "0" + m;
			} else {
				s = h + "" + m;
			}
      
			if (isSequence(s)){
				count++;
			}
		}
		
		System.out.println(count);
		
	}
  
	public static boolean isSequence (String s) {
		int d = Integer.parseInt(s.charAt(1) + "") - Integer.parseInt(s.charAt(0) + "");
		
		for (int i = 2; i < s.length(); i++){
			if ((Integer.parseInt(s.charAt(i) + "") - Integer.parseInt(s.charAt(i - 1) + "")) != d){
				return false;
			}
		}
		return true;
	}
}
