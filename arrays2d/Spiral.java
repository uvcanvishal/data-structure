package arrays2d;

import java.util.Scanner;

public class Spiral {
	private static void spiral(int a[][],int m,int n) {
		int r=0,c=0;
		while(r<m&&c<n) {
			for(int i=c;i<n;i++)
				System.out.print(a[r][i]+" ");
			r=r+1;
			for(int i=r;i<m;i++)
				System.out.print(a[i][n-1]+" ");
			n=n-1;
			if(r<m) {
				for(int i=n-1;i>=c;i--)
					System.out.print(a[m-1][i]+" ");
				m=m-1;
			}
			if(c<n) {
				for(int i=m-1;i>=r;i--)
					System.out.print(a[i][c]+" ");
				c=c+1;
			}
			
		}
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
		spiral(arr,m,n);
	}

}
