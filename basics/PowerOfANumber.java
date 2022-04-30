package basics;

import java.util.Scanner;

public class PowerOfANumber {
	private static void power(int x,int n) {
		int i=1,pow=1;
		while(i<=n) {
			pow=pow*x;
			i++;
		}
		System.out.println(pow);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		power(x,n);

	}

}
