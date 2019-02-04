import java.util.Scanner;

public class ccc01j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		boolean flag = true;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i=1; i<b; i++){
			if (((a*i)%b)==1){
				System.out.println(i);
				flag = false;
				break;
			}
		}
		if (flag){
			System.out.println("No such integer exists.");
		}
		
	}

}
