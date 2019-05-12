import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("mixin.txt"));
		PrintWriter pw = new PrintWriter(new File("mixout.txt"));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
    
		if (a % b == 0) pw.print(a / b);
		else {
			int remainder = a % b;
			pw.print((a / b) + " " + remainder + "/" + b);
		}
		
		pw.close();

	}
}
