package Patterns;

import java.util.Scanner;

public class Pattern9 {
	private static void pattern(int n) {
		int i=65,j,k;
		n=i+n;
		while(i<n) {
			j=65;
			k=i;
			while(j<=i) {
				System.out.print((char)k++);
				j++;
			}
			i++;
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
