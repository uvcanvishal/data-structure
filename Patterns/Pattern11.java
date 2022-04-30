package Patterns;

import java.util.Scanner;

public class Pattern11 {
	private static void pattern(int n) {
	int i=1,j,t,space=n*2,k;
	while(i<=n) {
		t=1;space=space-2;
		while(t<=space)
		{
			System.out.print(" ");
			t++;
		}
		j=1;k=i;
		while(j<=i) {
			System.out.print(k++);
			j++;
		}
		k=k-2;
		while(k>=i) {
			System.out.print(k--);
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
