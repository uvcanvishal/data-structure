package arrays;

import java.util.Scanner;

public class SwapAlternate {
	private static void swap(int []a,int n) {
		for(int i=0;i<n;i+=2) {
			if(i+1<n) {
				a[i+1]=a[i]+a[i+1];
				a[i]=a[i+1]-a[i];
				a[i+1]=a[i+1]-a[i];
			}
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
		swap(a,n);
	}

}
