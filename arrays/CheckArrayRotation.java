package arrays;

import java.util.Scanner;

public class CheckArrayRotation {
	private static void binarysearchiterative(int []a,int l,int h) {
		while(l<=h) {
			int m=l+(h-l)/2;
			if(m<h && a[m]>a[m+1])
			{
				System.out.println(m+1);
				return;
			}
			if(m>l && a[m-1]>a[m]) {
				System.out.println(m);
				return;
			}
			if(a[m]>a[h])
				l=m+1;
			else
				h=m-1;
		}
		System.out.println("0");
		return;
	}
	private static void check(int []a,int n) {
		int index=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				index=i+1;
			}
		}
		System.out.println(index);
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
		check(a,n);
		binarysearchiterative(a,0,n-1);
	}

}
