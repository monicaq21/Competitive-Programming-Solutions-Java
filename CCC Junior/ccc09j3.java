import java.util.Scanner;

public class ccc09j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		int a = Integer.parseInt(S);
		String k = Integer.toString(a, 60);
		a = Integer.parseInt(k);
		
		int victoria = a - 300;
		if (victoria < 0){
			victoria = victoria + 2400;
		}
		int edmonton = a - 200;
		if (edmonton < 0){
			edmonton = edmonton + 2400;
		}
		int winnipeg = a - 100;
		if (winnipeg < 0){
			winnipeg = winnipeg + 2400;
		}
		int halifax = a + 100;
		if (halifax >= 2400){
			halifax = halifax - 2400;
		}
		int john = a + 130;
		if (john >= 2400){
			john = john - 2400;
		}
		if (john % 100 >= 60){
			john -= 60;
			john += 100;
		}
		

		System.out.println(a + " in Ottawa");
		System.out.println(victoria + " in Victoria");
		System.out.println(edmonton + " in Edmonton");
		System.out.println(winnipeg + " in Winnipeg");
		System.out.println(a + " in Toronto");
		System.out.println(halifax + " in Halifax");
		System.out.print(john + " in St. John's");

	}

}
