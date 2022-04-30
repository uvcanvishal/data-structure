package Patterns;

import java.util.Scanner;

public class Pattern3 {
	private static void pattern(int n) {
		int i=1,j,t,space=n;
		while(i<=n)
		{
			j=1;
			t=1;
			space=space-1;
			while(t<=space) {
				System.out.print(" ");
				t++;
			}
			while(j<=i*2-1) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i++;
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
