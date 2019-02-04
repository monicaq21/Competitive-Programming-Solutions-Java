import java.util.*

public class ccc18j3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d12 = sc.nextInt();
		int d23 = sc.nextInt();
		int d34 = sc.nextInt();
		int d45 = sc.nextInt();
		
		int[] d = new int[5];
		d[0]=0;
		d[1]=d12;
		d[2]=d[1]+d23;
		d[3]=d[2]+d34;
		d[4]=d[3]+d45;
		
		for (int i=0; i<5; i++){
			System.out.print(Math.abs(d[i]-d[0])+" ");
			System.out.print(Math.abs(d[i]-d[1])+" ");
			System.out.print(Math.abs(d[i]-d[2])+" ");
			System.out.print(Math.abs(d[i]-d[3])+" ");
			System.out.print(Math.abs(d[i]-d[4])+" ");
			System.out.println();
		}
		
		
		


	}
}
