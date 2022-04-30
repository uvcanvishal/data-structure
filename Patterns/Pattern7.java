package Patterns;

import java.util.Scanner;

public class Pattern7 {
	private static void pattern(int n) {
		int i=1,j,k;
		while(i<=n) {
			k=i;
			j=1;
			while(j<=i) {
				System.out.print(k--);
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
