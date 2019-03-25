import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("countin.txt"));
		PrintWriter pw = new PrintWriter(new File("countout.txt"));
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) pw.println(i);
		
		pw.close();

	}
}
