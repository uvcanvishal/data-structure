package dynamicprogramming;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
	public static int lis(int arr[],int n,int prev,int cur) {
		if(cur==arr.length)
			return 0;
		int include=0;
		if(prev<arr[cur])
			include=1+lis(arr, n, arr[cur], cur+1);
		int exclude=0;
		exclude=lis(arr, n, prev, cur+1);
		return Math.max(include, exclude);
	}
	private static int lisM(int arr[],int n,int storage[][],int prev,int cur) {
		if(cur==n)
			return 0;
		if(storage[prev+1][cur]!=-1)
			return storage[prev+1][cur];
		int include=0;
		if(prev==-1 || arr[prev]<arr[cur])
			include=1+lisM(arr, n,storage, cur, cur+1);
		int exclude=0;
		exclude=lisM(arr, n,storage, prev, cur+1);
		storage[prev+1][cur]=Math.max(include, exclude);
		return storage[prev+1][cur];
	}
	public static int lisM(int arr[],int n) {
		int storage[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				storage[i][j]=-1;
		return lisM(arr,n,storage,-1,0);
	}
	public static int lisDP(int arr[],int n) {
		int dp[]=new int[n];
		dp[0]=1;
		int maxvalue=1;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && dp[i]<=dp[j]) {
					dp[i]=dp[j]+1;
				}
			}
			maxvalue=Math.max(dp[i], maxvalue);
		}
		return maxvalue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(lisDP(arr,n));
		System.out.println(lisM(arr,n));
		System.out.println(lis(arr,n,-1,0));
	}

}
