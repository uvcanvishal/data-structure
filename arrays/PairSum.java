package arrays;

import java.util.Scanner;

public class PairSum {
    private static void psum(int []a,int sum) {
    	int c=0;
    	for(int i=0;i<a.length;i++) {
    		int k=sum-a[i];
    		for(int j=i+1;j<a.length;j++) {
    			if(k==a[j])
    				c++;
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
		psum(a,sum);

	}

}
