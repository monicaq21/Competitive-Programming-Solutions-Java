import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("addin.txt"));
		PrintWriter pw = new PrintWriter(new File("addout.txt"));
    
		int a = sc.nextInt(), b = sc.nextInt();
    
		pw.println(a + b);
    
		pw.close();

	}
}
