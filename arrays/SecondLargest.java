package arrays;

import java.util.Scanner;

public class SecondLargest {
	private static void secondLargest(int[]a,int n) {
		int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max<a[i]) {
				smax=max;
				max=a[i];
			}
			if(a[i]>smax&&a[i]!=max)
				smax=a[i];
		}
		System.out.println("second largest="+smax);
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
		secondLargest(a,n);
	}

}
