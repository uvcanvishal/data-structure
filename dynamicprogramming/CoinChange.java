package dynamicprogramming;

import java.util.Scanner;

public class CoinChange {
	public static int coinChange(int arr[],int n,int v) {
		if(v==0)
			return 1;
		if(v<0 || n<0)
			return 0;
		int include=coinChange(arr,n,v-arr[n]);
		int exclude=coinChange(arr,n-1, v);
		return include+exclude;
	}
	private static int coinChangeM(int arr[],int n,int v,int storage[][]) {
		if(v==0)
			return 1;
		if(v<0 || n<0)
			return 0;
		if(storage[n][v]!=-1)
			return storage[n][v];
		int include=coinChangeM(arr,n,v-arr[n],storage);
		int exclude=coinChangeM(arr,n-1, v,storage);
		storage[n][v]=include+exclude;
		return storage[n][v];
	}
	public static int coinChangeM(int arr[],int n,int v) {
		int storage[][]=new int[n][v+1];
		for(int i=0;i<n;i++)
			for(int j=0;j<=v;j++)
				storage[i][j]=-1;
		return coinChangeM(arr, n-1, v, storage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int v=sc.nextInt();
		System.out.println(coinChangeM(arr,n,v));
		System.out.println(coinChange(arr,n-1,v));
	}

}
