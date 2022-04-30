package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
	private static void tsum(int []a,int sum) {
		int c=0;
		Arrays.sort(a);
		 for(int i=0;i<a.length-1;i++) {
			 int l=i+1;
			 int r=a.length-1;
			 while(l<r) {
				 if(a[i]+a[l]+a[r]==sum)
				 {
					 System.out.println(a[i]+" "+a[l]+" "+a[r]);
					 c++;
					 l++;
					 r--;
				 }else if(a[i]+a[l]+a[r]<sum) {
					 l++;
				 }else {
					 r--;
				 }
			 }
		 }
		 System.out.println(c);
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
		System.out.println("Enter the value of sum");
		int sum=sc.nextInt();
		tsum(a,sum);
	}

}
