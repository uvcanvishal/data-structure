package basics;

import java.util.Scanner;

public class SumOfEven_Odd {
	private static void sum(int n) {
		int odd=0,even=0,k;
		while(n>0) {
			k=n%10;
			if(k%2==0)
				even+=k;
			else
				odd+=k;
			n=n/10;
		}
		System.out.println(even+" "+odd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sum(n);

	}

}
