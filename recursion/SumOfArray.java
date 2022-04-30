package recursion;

import java.util.Scanner;

public class SumOfArray {
	private static int sum(int a[]) {
		return sum(a,0);
	}
	private static int sum(int a[],int startIndex) {
		if(startIndex==a.length)
			return 0;
		int ans=a[startIndex]+sum(a,startIndex+1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(sum(a));
	}

}
