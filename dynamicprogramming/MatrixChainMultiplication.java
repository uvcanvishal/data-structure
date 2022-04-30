package dynamicprogramming;

import java.util.Scanner;

public class MatrixChainMultiplication {
	public static int mcm(int arr[],int i,int j) {
		if(i>=j)
			return 0;
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			int temp=mcm(arr,i,k)+mcm(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
			ans=Math.min(temp, ans);
		}
		return ans;
	}
	public static int mcmM(int arr[],int i,int j,int storage[][]) {
		if(i>=j)
			return 0;
		if(storage[i][j]!=-1)
			return storage[i][j];
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			int temp=mcmM(arr,i,k,storage)+mcmM(arr,k+1,j,storage)+(arr[i-1]*arr[k]*arr[j]);
			ans=Math.min(temp, ans);
			storage[i][j]=ans;
		}
		return storage[i][j];
	}
	public static int mcmM(int arr[],int k,int l) {
		int storage[][]=new int[100][100];
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++)
				storage[i][j]=-1;
		return mcmM(arr,k,l,storage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(mcmM(arr,1,n));
		System.out.println(mcm(arr,1,n));
	}

}
