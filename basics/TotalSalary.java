package basics;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
		char grade=sc.next().charAt(0);
		grade=Character.toUpperCase(grade);
		if(basic>=0&&basic<=7500000) {
			double hra=basic*0.2;
			double da=basic*0.5;
			int allow;
			if(grade=='A')
				allow=1700;
			else if(grade=='B')
				allow=1500;
			else
				allow=1300;
			double pf=0.11*basic;
			double total=basic+hra+da+allow-pf;
			System.out.println(Math.round(total));
		}
		else
		{
			System.out.println("Not a valid basic salary");
			
		}

	}

}
