package arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {
	private static void merge(int a[],int n,int b[],int m) {
		int i=0,j=0,k=0;
		int c[]=new int[m+n];
		while(i<n&&j<m) {
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<n)
			c[k++]=a[i++];
		while(j<m)
			c[k++]=b[j++];
		for(i=0;i<m+n;i++)
			System.out.print(c[i]+" ");
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
		System.out.println("Enter the number of elements in 2nd array");
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		merge(a,n,b,m);
	}

}
