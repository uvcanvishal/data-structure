package recursion;

import java.util.Scanner;

public class QuickSort {
	private static int partition(int a[],int l,int h) {
		int pivot=a[l];
		int count=0;
		for(int i=l+1;i<=h;i++)
		{
			if(a[i]<=pivot)
				count++;
		}
		int pivotindex=l+count;
		a[l]=a[pivotindex];
		a[pivotindex]=pivot;
		int i=l,j=h;
		while(i<j) {
			while(i<=h&&a[i]<=pivot)
				i++;
			while(a[j]>pivot)
				j--;
			if(i<=j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
		}
		return pivotindex;
	}
	private static void quicksort(int a[],int l,int h) {
		if(l>=h)
			return;
		int partition=partition(a,l,h);
		quicksort(a,l,partition-1);
		quicksort(a,partition+1,h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		quicksort(a,0,a.length-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
