package dynamicprogramming;

import java.util.Scanner;

public class MaximumSquareSubmatrix {
	public static int maxSquareSubmatrix(int arr[][],int m,int n) {
		int s[][]=new int[m][n];
		for(int i=0;i<m;i++)
			if(arr[i][0]==0)
				s[i][0]=1;
			else
				s[i][0]=0;
		for(int j=0;j<n;j++)
			if(arr[0][j]==0)
				s[0][j]=1;
			else
				s[0][j]=0;
		for(int i=1;i<m;i++)
			for(int j=1;j<n;j++)
				if(arr[i][j]==1)
					s[i][j]=0;
				else
					s[i][j]=1+Math.min(s[i][j-1], Math.min(s[i-1][j], s[i-1][j-1]));
		int max=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(s[i][j]>max)
					max=s[i][j];
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		System.out.println(maxSquareSubmatrix(arr,m,n));
	}

}
