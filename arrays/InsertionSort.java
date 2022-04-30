package arrays;

import java.util.Scanner;

public class InsertionSort {
	private static void insertion(int []a,int n) {
		for(int i=0;i<n;i++) {
			int j=i-1;
			int temp=a[i];
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
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
		insertion(a,n);
	}

}
