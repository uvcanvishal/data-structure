package recursion;

import java.util.Scanner;

public class PrintSubsetSumToK {
	private static void subset(int input[],int startIndex,int output[],int k) {
		if(startIndex==input.length) {
			if(k==0) {
			for(int i:output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
			}
			else
				return;
		}
		int newOutput[]=new int[output.length+1];
		int i=0;
		for(;i<output.length;i++) {
			newOutput[i]=output[i];
		}
		newOutput[i]=input[startIndex];
		subset(input,startIndex+1,output,k);
		subset(input,startIndex+1,newOutput,k-input[startIndex]);
	}
	private static void subset(int input[],int k) {
		int output[]=new int[0];
		subset(input,0,output,k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		subset(a,k);
	}
}
