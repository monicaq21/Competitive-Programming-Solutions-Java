import java.io.*;
import java.util.*;
public class coci091p1 {
	
    public static void main(String[] args) throws IOException{
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int N = 8;
        int[] a = new int[N];
	   
        for (int i = 0; i < N; i++){
        	a[i] = sc.nextInt();
        }
        
        int diff = a[1] - a[0];
	    
        for (int i = 1; i < 7; i++){
        	if (a[i + 1] - a[i] != diff){
        		System.out.println("mixed");
        		return;
        	}
        }
	    
        if (diff == 1) System.out.println("ascending");
        else System.out.println("descending");
        
    }
}
