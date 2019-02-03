package contest_questions;

import java.util.Arrays;
import java.util.Scanner;

public class ccc01s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//incorrect
		
		int n = sc.nextInt();
		int[] xx = new int[n];
		int[] yy = new int[n];
		for (int i=0; i<n; i++){
			xx[i]=sc.nextInt();
			yy[i]=sc.nextInt();
		}
		double x =0;
		double y =0;
		double s =0;
		for (int len=1; len<n; len++){
			for (int i=0; i<n-len; i++){
				if (Math.abs(xx[i]-xx[i+len])>x){
					x=Math.abs(xx[i]-xx[i+len]);
				}
				if (Math.abs(yy[i]-yy[i+len])>y){
					y=Math.abs(yy[i]-yy[i+len]);
				}
				if (Math.sqrt((Math.pow((Math.abs(yy[i]-yy[i+len])),2))+Math.pow((Math.abs(xx[i]-xx[i+len])),2))>s){
					s=Math.sqrt((Math.pow((Math.abs(yy[i]-yy[i+len])),2))+Math.pow((Math.abs(xx[i]-xx[i+len])),2));
				}
			}
		}
		double[] p = {x,y,s};
		Arrays.sort(p);
		
		
		double f = p[2];
		
		if (f==x){
			System.out.printf("%.2f",x);
		} else if (f==y){
			System.out.printf("%.2f",y);
		} else{
			System.out.printf("%.2f",s);
		}
	}

}
