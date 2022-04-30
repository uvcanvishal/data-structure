package Patterns;

import java.util.Scanner;

public class Pattern12 {
	private static void pattern(int n) {
		int i=1,j,t,space=(n/2)+1,k=n;
		while(i<=n) {
			if(i<=(n/2)+1) {
				t=1;
				space=space-1;
				while(t<=space) {
					System.out.print(" ");
					t++;
				}
				j=1;
				while(j<=i*2-1) {
					System.out.print("*");
					j++;
				}
			}else {
				t=(n/2)+2;
				while(t<=i) {
					System.out.print(" ");
					t++;
				}
				j=1;
				while(j<=(n*2)-(i*2)+1)
				{
					System.out.print("*");
					j++;
				}
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
