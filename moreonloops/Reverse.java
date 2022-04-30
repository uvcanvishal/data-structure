package moreonloops;

import java.util.Scanner;

public class Reverse {
	private static void reverse(int n) {
		int s=0,r=0;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println("Reverse="+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		reverse(n);

	}

}
