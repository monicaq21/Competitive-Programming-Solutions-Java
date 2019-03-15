import java.util.Scanner;

public class ccc05j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt(), 
			evening = sc.nextInt(), 
			weekend = sc.nextInt();
		
		double dayprice = 0;
		if (day <= 100) dayprice = 0;
		else dayprice = ((day - 100) * 0.25);
		
		double eveningprice = evening * 0.15, 
				weekendprice = weekend * 0.20,
				planA = dayprice+eveningprice + weekendprice,
				plana = Math.round(planA * 100.0) / 100.0;
		System.out.println("Plan A costs " + plana);
		
		double dayPrice = 0;
		if (day <= 250) dayPrice = 0;
		else dayPrice = ((day - 250) * 0.45);

		double eveningPrice = evening * 0.35,
				weekendPrice = weekend * 0.25,
				planB = dayPrice + eveningPrice + weekendPrice,
				planb = Math.round(planB * 100.0) / 100.0;
		System.out.println("Plan B costs " + planb);
		
		if (plana > planb) System.out.println("Plan B is cheapest.");
		else if (plana < planb) System.out.println("Plan A is cheapest.");
		else System.out.println("Plan A and B are the same price.");

		
	}

}
