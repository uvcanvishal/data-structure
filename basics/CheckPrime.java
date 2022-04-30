package basics;

import java.util.Scanner;

public class CheckPrime {
	private static int prime(int n) {
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				return -1;
			}
			i++;
		}
			return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		if(n<=2) {
			System.out.println("not a valid number");
		}else {
			int k=prime(n);
			if(k==-1) {
				System.out.println("Not a prime number");
			}else if(k==1) {
				System.out.println("prime number it is");
			}
		}
		sc.close();
	}

}
