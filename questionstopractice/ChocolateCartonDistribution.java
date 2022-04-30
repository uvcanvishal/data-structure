package questionstopractice;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateCartonDistribution {
	private static int distribute(int arr[],int n,int m) {
		if(m==0||n==0)
			return 0;
		if(m>n)
			return -1;
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++) {
			int diff=arr[i+m-1]-arr[i];
			if(diff<min)
				min=diff;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(distribute(a,n,m));

	}

}
