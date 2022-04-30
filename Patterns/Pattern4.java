package Patterns;

import java.util.Scanner;

public class Pattern4 {
	private static void pattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		pattern(n);

	}

}
