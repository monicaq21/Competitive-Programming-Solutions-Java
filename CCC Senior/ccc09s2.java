import java.io.*;
import java.util.*;

public class ccc09s2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int R = sc.nextInt();
		int C = sc.nextInt();
		String[] light = new String[R];
		sc.nextLine();
		
		LinkedList<String> previous = new LinkedList<String>();
		LinkedList<String> current = new LinkedList<String>();
		previous.add(light[0]);
		
		for (int r = 0; r < R; r++) {
			light[r] = sc.nextLine().replaceAll(" ", "");
		}
		
		for (int r = 1; r < R; r++) {
			previous.clear();
			
			for (int q = 0; q < current.size(); q++){
				previous.add(current.get(q));
			}
			
			current.clear();
			String O = light[r];
			current.add(O);
			
			for (int i = 0; i < previous.size(); i++) {
				String p = previous.get(i);
				String combine = combine(O, p);
				
				if (!current.contains(combine)) {
					current.add(combine);
				}
			}	
		}
		
		if (current.size() == 1){
		    System.out.println(1);
		} else {
		    System.out.println(current.size() + 1);
		}
	}


	public static String combine(String O, String p) {
		String t = "";
		
		for (int e = 0; e < p.length(); e++){
			t += (Integer.parseInt(O.charAt(e) + "") + Integer.parseInt(p.charAt(e) + "")) % 2;
		}
		
		return t;
	}

}
