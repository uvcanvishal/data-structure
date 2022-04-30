package arrays2d;

import java.util.Scanner;

public class Wave {
	private static void wave(int a[][],int m,int n) {
		int wave=0;
		for(int i=0;i<n;i++) {
			if(wave==0)
			{
				for(int j=0;j<m;j++) {
					System.out.print(a[j][i]+" ");
					wave=1;
				}
			}else
			{
				for(int j=m-1;j>=0;j--) {
					System.out.print(a[j][i]+" ");
					wave=0;
				}
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
		wave(arr,m,n);
	}

}
