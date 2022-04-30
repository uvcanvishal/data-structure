package Patterns;

import java.util.Scanner;

public class Pattern10 {
	private static void pattern(int n) {
		int i=1,j,t,space=n*2,k=n;
		while(i<=n) {
			j=1;
			while(j<=n-i+1) {
				System.out.print(k);
				j++;
			}
			i++;
			k--;
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
