package recursion;

import java.util.Scanner;

public class Power {
	private static int power1(int x,int n) {
		if(n==0)
			return 1;
		if(x==0)
			return x;
		if(n%2==0)
			return power(x,n/2)*power(x,n/2);
		else
			return x*power(x,n/2)*power(x,n/2);
	}
	private static int power(int x,int n) {
		if(n==0)
			return 1;
		if(x==0)
			return x;
		return x*power(x,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(power(x,n));
		System.out.println(power1(x,n));

	}

}
