package arrays;

import java.util.Scanner;

public class SelectionSort {
	private static void selection(int []a,int n) {
		for(int i=0;i<n-1;i++) {
			int min=a[i];
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<min)
				{
					min=a[j];
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				a[minIndex]=a[i];
				a[i]=min;
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
		selection(a,n);
	}

}
