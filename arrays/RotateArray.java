package arrays;

import java.util.Scanner;

public class RotateArray {
	private static int g_c_d(int a,int b) {
		if(b==0)
			return a;
		else
			return g_c_d(b, a%b);
	}
	private static void rotate(int []a,int d,int n) {
		int gcd=g_c_d(d, n);
		for(int i=0;i<gcd;i++) {
			int t=a[i];
			int j=i;
			while(true) {
				int k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				a[j]=a[k];
				j=k;
			}
			a[j]=t;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
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
		System.out.println("enter the value of d");
		int d=sc.nextInt();
		rotate(a,d,n);
	}

}
