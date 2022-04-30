package moreonloops;

import java.util.Scanner;

public class FibonacciMemeber {
	private static boolean isperfectsquare(int x) {
		int s=(int)Math.sqrt(x);
		return (s*s==x);
	}
	private static boolean isfib(int n) {
		return (isperfectsquare(5*n*n+4))|| (isperfectsquare(5*n*n-4));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;                           
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println(isfib(n));

	}

}
