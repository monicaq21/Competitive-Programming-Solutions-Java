import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("sitin.txt"));
		PrintWriter pw = new PrintWriter(new File("sitout.txt"));
    
		int a = sc.nextInt(), b = sc.nextInt(), total = sc.nextInt();
    
		if (total <= a * b) pw.print(total + " " + 0);
		else pw.print((a*b) + " " + (total - a*b));
    
		pw.close();

	}
}
