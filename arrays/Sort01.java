package arrays;

import java.util.Scanner;

public class Sort01 {
	private static void sort01(int []a) {
		int l=0,m=0;
		while(m<=a.length-1) {
			if(a[m]==0) {
				int t=a[m];
				a[m]=a[l];
				a[l]=t;
				m++;
				l++;
			}
			else
			{
				m++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in 1st array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sort01(a);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}

	}

}
