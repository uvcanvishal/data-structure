package Patterns;

import java.util.Scanner;

public class Pattern2 {
	private static void pattern(int n) {
		int i=1,j,k,space=n*2,t;
		while(i<=n)
		{
			j=1;
			k=i;
			space=space-2;
			t=1;
			while(t<=space) {
				System.out.print(" ");
				t++;
			}
			while(j<=i) {
				System.out.print(k++ + "");
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
