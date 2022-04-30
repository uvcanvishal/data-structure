package moreonloops;

import java.util.Scanner;

public class SquareRoot1 {
	private static int sqrt(int n) {
		if(n==0||n==1)
			return n;
		long start=0,end=n/2,ans=0;
		while(start<=end) {
			int mid=(int)(start+end)/2;
			if(mid*mid==n)
				return mid;
			if(mid*mid<n) {
				start=mid+1;
				ans=mid;
			}
			else
				end=mid-1;
		}
		return (int)ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println(sqrt(n));

	}
}
