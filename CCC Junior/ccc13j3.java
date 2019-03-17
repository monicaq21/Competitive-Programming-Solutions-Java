import java.util.*;

public class ccc13j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int begin = year;
    		
		while (true) {
			begin++;
			if (isD(begin)){
				System.out.println(begin);
				break;
			}
		}
	}


	public static boolean isD(int year) {
		// TODO Auto-generated method stub
    
		String s = "" + year;
		char[] a = s.toCharArray();
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++){
			if (i != a.length - 1 && a[i] == a[i + 1]){
				return false;
			}
		}
		return true;
	}

}
