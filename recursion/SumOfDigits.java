package recursion;

import java.util.Scanner;

public class SumOfDigits {
	private static int sum(int n) {
		if(n==0)
			return 0;
		if(n<10)
			return n;
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));

	}

}
