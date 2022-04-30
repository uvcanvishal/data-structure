package arrays;

import java.util.Scanner;

public class BinarySearch {
	private static int binary(int []a,int l,int h,int x) {
		while(l<=h) {
			int m=l+(h-l)/2;
			if(a[m]==x)
				return m;
			if(a[m]<x)
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}
	private static int binaryrecursive(int []a,int l,int h,int x) {
		while(l<=h) {
			int m=l+(h-l)/2;
			if(a[m]==x)
				return m;
			if(a[m]<x)
				return binaryrecursive(a,m+1,h,x);
			else
				return binaryrecursive(a,l,m-1,x);
		}
		return -1;
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
		System.out.println("Enter element to be searched");
		int x=sc.nextInt();
		System.out.println(binary(a,0,n-1,x));
		System.out.println(binaryrecursive(a,0,n-1,x));
	}

}
