import java.io.*;
import java.util.*;
public class coci084p1 {
    
    public static void main(String[] args) throws IOException{
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        for (int i=0; i<5; i++) a[i] = sc.nextInt();
	    
        int j = 0;
	    
        while (a[0] != 1 || a[1] != 2 || a[2] != 3 || a[3] != 4){
        	
		if (j == 4) j = 0;
        	
		if (a[j] > a[j + 1]){
			
        		int p = a[j];
        		a[j] = a[j + 1];
        		a[j + 1] = p;
			
        		for (int i: a) System.out.print(i + " ");
            		System.out.println();
			
        	}
		
        	j++;
		
        }
    }
}
