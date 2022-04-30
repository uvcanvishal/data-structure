package recursion;

import java.util.Scanner;

public class MergeSort {
	private static void merge(int a[],int l,int m,int h) {
		int ans[]=new int[h-l+1];
		int i=l;
		int j=m+1;
		int k=0;
		System.out.println("hi");
		System.out.println(i+" "+" "+l+" "+m+" "+j+" "+h);
		while(i<=m&&j<=h) {
			System.out.println("1");
			if(a[i]<a[j])
			{
				System.out.println(a[i]);
				ans[k]=a[i];
				i++;
				k++;
				
			}else {
				System.out.println(a[j]);
				ans[k]=a[j];
				j++;
				k++;
			}
			System.out.println(i+" "+m+" "+h);
		}
			while(i<=m) {
				ans[k]=a[i];
				k++;
				i++;
			}
			while(j<=h) {
				ans[k]=a[j];
				k++;
				j++;
			}
		for(int it=0;it<k;it++) {
			a[l+it]=ans[it];
		}
	}
	private static void mergesort(int a[],int l,int h) {
		System.out.println("hello"+l+" "+h);
		if(h<=l) {
			return;
		}
			System.out.println("inside if");
			int m=(l+h)/2;
			System.out.println(m+"*");
			mergesort(a, l, m);
			mergesort(a, m+1, h);
			merge(a,l,m,h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		mergesort(a,0,a.length-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
