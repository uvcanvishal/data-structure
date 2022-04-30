package recursion;

import java.util.Scanner;

public class NumberOfDigits {
	private static int digits(int n) {
		if(n/10==0)
			return 1;
		return 1+digits(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(digits(n));

	}

}
