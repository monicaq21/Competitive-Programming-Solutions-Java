import java.util.*;

public class ccc10s1 {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] a = new int[n];
		
		for (int i=0; i<n; i++){
			s[i] = sc.next();
			int o = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			a[i] = 2*o+3*p+q;
		}
		
		
		int max1 = 0;
		int max2 = 0;
		String s1 = "";
		String s2 = "";
    
		for (int i=0; i<n; i++){
			if (a[i]>max1){
				max2=max1;
				max1=a[i];
				s2=s1;
				s1=s[i];
			} else if (a[i]==max1){
				String[] t = {s[i],s1};
				Arrays.sort(t);
				if (t[0]==s[i]){
					s2=s1;
					s1=s[i];
				} else {
				    s2=s[i];
				}
			} else if (a[i]>max2){
				max2=a[i];
				s2=s[i];
			} else if (a[i]==max2){
				String[] t = {s[i],s2};
				Arrays.sort(t);
				if (t[0]==s[i]){
					s2=s[i];
				}
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
