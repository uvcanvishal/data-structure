package arrays2d;

import java.util.Scanner;

public class LargestRowOrColumn {
	private static void largest(int a[][],int m,int n) {
		int index=0,sum=0,maxsum=Integer.MIN_VALUE;
		String s="";
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum=sum+a[i][j];
			}
			if(sum>maxsum) {
				maxsum=sum;
				index=i;
				s="row";
			}
			sum=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum=sum+a[j][i];
			}
			if(sum>maxsum) {
				maxsum=sum;
				index=i;
				s="column";
			}
			sum=0;
		}
		System.out.println(s+" "+index+" "+maxsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
		largest(arr,m,n);
	}

}
