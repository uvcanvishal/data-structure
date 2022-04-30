package moreonloops;

import java.util.Scanner;

public class Fibonacci {
	private static int fib(int n) {
		if(n==1||n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;                           
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println(fib(n));

	}

}
