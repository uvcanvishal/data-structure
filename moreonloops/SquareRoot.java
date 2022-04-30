package moreonloops;

import java.util.Scanner;

public class SquareRoot {
	private static void sqrt(int n) {
		int count=0;
		while(n>1) {
			n=n/2;
			count++;
		}
		System.out.println("Square root="+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		sqrt(n);

	}

}
