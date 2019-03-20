import java.util.*;

public class ccc06s1 {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		String mom = sc.nextLine();
		String dad = sc.nextLine();
		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++){
			String s = sc.nextLine();
			char[] k = s.toCharArray();
			boolean flag = true;
			
			for (int l = 0; l < 5; l++){
				if (k[l] >= 65 && k[l] <= 90){
					if (!mom.contains("" + k[l]) && !dad.contains("" + k[l])){
						System.out.println("Not their baby!");
						flag = false;
						break;
					}
				} else if (!mom.contains("" + k[l]) || !dad.contains("" + k[l])){
					System.out.println("Not their baby!");
					flag = false;
					break;
				}
			}
			
			if (flag){
				System.out.println("Possible baby.");
			}
		}
	}

}
