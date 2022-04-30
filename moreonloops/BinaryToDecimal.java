package moreonloops;

import java.util.Scanner;

public class BinaryToDecimal {
	private static void btd(int n) {
		int r=0,s=0,k=1;
		while(n>0) {
			r=n%10;
			s+=r*k;
			k=k*2;
			n=n/10;
		}
		System.out.println("decimal number="+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		btd(n);
	}

}
