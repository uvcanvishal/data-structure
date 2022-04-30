package recursion;

import java.util.Scanner;

public class Staircase {
	private static int staircase(int n) {
		if(n==0||n==1)
			return 1;
		if(n==2)
			return 2;
		return staircase(n-3)+staircase(n-2)+staircase(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(staircase(n));
	}

}
