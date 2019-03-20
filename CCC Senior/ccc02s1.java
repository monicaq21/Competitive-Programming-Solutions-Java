import java.util.Scanner;

public class ccc02s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int pink = sc.nextInt();
		int green = sc.nextInt();
		int red = sc.nextInt();
		int orange = sc.nextInt();
		int cost = sc.nextInt();
		int count = 0;
		int min = Integer.MAX_VALUE;

		for (int k = 0; k <= cost; k++){
			for (int i = 0; i <= cost; i++){
				for (int l = 0; l <= cost; l++){
					for (int j = 0; j <= cost; j++){
						if ((k * pink + j * green + l * red + i * orange) == cost){
							System.out.println("# of PINK is " + k + " # of GREEN is " + j + " # of RED is " + l + " # of ORANGE is " + i);
							count++;
							if ((k + j + l + i) < min){
								min = k + j + l + i;
							}
						}
					}
				}
			}
		}
		
		System.out.println("Total combinations is " + count + ".");
		System.out.println("Minimum number of tickets to print is " + min + ".");
		
	}

}
