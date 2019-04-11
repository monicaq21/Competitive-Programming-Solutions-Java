import java.io.*;
import java.util.*;
public class coci093p2 {

    public static void main(String[] args) throws IOException{
        //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextInt();
        
	int b = sc.nextInt();
        
	double dig = Math.pow(10, b);
        
	a = Math.round(a / dig);
        
	System.out.println((int) (a * dig));
	    
    }
}
