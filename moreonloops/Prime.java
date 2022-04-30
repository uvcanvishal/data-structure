package moreonloops;

import java.util.Scanner;

public class Prime {
	private static void prime(int n) {
		boolean isprime[]=new boolean[n+1];
		for(int i=0;i<=n;i++) {
			isprime[i]=true;
		}
		for(int i=2;i<=n;i++) {
			if(isprime[i]==true) {
				for(int j=i*i;j<=n;j+=i) {
					isprime[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isprime[i])
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;                           
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		prime(n);

	}

}
