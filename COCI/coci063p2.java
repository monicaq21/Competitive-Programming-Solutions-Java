import java.util.*;

public class coci063p2 {
	
	public static class pair {
		int x;
		int y;
		public pair(int i, int j) {
			x = i;
			y = j;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Hashtable <Character,pair> h = new Hashtable <Character,pair>();
    
		for (int i=0; i<4; i++){
			for (int l=0; l<4; l++){
      
				if (i == 3 && l == 3){
					break;
				}
        
				h.put((char) (i * 4 + 'A' + l), new pair(i, l));
        
			}
		}
		
		int count = 0;
		
		for (int i=0; i<4; i++){
			
			String s = sc.nextLine();
      
			for (int l=0; l<4; l++){
				
				char k = s.charAt(l);
        
				if (k == '.') continue;
        
				pair e = h.get(k);
				count += Math.abs(e.x - i);
				count += Math.abs(e.y - l);
				
			}
      
		}
    
		System.out.println(count);
		
	}

}
