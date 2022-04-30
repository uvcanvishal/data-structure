package arrays2d;

import java.util.Scanner;

public class RowWiseSum {
	private static void sum(int [][]a) {
		for(int i=0;i<a.length;i++)
		{
			int s=0;
			for(int j=0;j<a[0].length;j++) {
				s+=a[i][j];
			}
			System.out.print(s+" ");
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
		sum(arr);
	}

}
