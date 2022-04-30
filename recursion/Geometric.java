package recursion;

import java.util.Scanner;

public class Geometric {
	private static double geometric(int n) {
		if(n==0)
			return 1;
		return 1/(double)Math.pow(2, n)+geometric(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(geometric(n));

	}

}
