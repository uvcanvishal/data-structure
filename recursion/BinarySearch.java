package recursion;

import java.util.Scanner;

public class BinarySearch {
	private static int binary(int a[],int x,int l,int h) {
		if(l>h)
			return -1;
		int m=l+(h-l)/2;
		//System.out.println(m);
		if(a[m]==x)
			return m;
		if(a[m]<x)
			return binary(a,x,m+1,h);
		else
			return binary(a,x,l,m-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(binary(a,x,0,n-1));

	}

}
