import java.util.Scanner;

public class ccc09j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trout = sc.nextInt(),
				pike = sc.nextInt(),
				pickerel = sc.nextInt(),
				ways = sc.nextInt(),
				maxtrout = ways/trout,
				maxpike = ways/pike,
				maxpickerel = ways/pickerel,
				count = 0;

		for (int j=0; j<=maxpickerel; j++)
			for (int l=0; l<=maxpike; l++)
				for (int i=0; i<=maxtrout; i++)
					if (i*trout+j*pickerel+l*pike<=ways && i*trout+j*pickerel+l*pike!=0){
						System.out.println(i+" Brown Trout, "+l+" Northern Pike, "+j+" Yellow Pickerel");
						count++;
					}

		System.out.println("Number of ways to catch fish: "+count);


	}
}
