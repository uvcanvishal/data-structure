package basics;

import java.util.Scanner;

public class Factorial {
	private static void factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		factorial(n);
		sc.close();
		
	}

}
