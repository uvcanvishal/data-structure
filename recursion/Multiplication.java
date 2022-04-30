package recursion;

import java.util.Scanner;

public class Multiplication {
	private static int multiply(int m,int n) {
		if(m<n)
			return multiply(n,m);
		if(n==0)
			return 0;
		return m+multiply(m,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(multiply(m,n));

	}

}
