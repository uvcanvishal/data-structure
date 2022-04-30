package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
	private static void sum(int []a,int n,int []b,int m) {
		int i=n-1,j=m-1,carry=0,k=0,max=0;
		if(n>=m)
			max=n;
		else
			max=m;
		k=max;
		int c[]=new int[max+1];
		while(i>=0||j>=0) {
			int sum=0;
			if(i>=0)
				sum+=a[i--];
			if(j>=0)
				sum+=b[j--];
			sum+=carry;
			//System.out.println(sum);
			c[k--]=sum%10;
			carry=sum/10;
			//System.out.println(carry);
		}
		c[k]=carry;
		for(i=0;i<max+1;i++) {
			System.out.print(c[i]+" ");
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
		System.out.println("Enter the number of elements in 2nd array");
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		sum(a,n,b,m);
	}

}
