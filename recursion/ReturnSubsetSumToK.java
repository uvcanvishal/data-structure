package recursion;

import java.util.Scanner;

public class ReturnSubsetSumToK {
	private static int[][] subset(int input[],int startIndex,int k){
		if(startIndex==input.length) {
			if(k==0)
				return new int[1][0];
			else
				return new int[0][0];
		}
		int smallOutput1[][]=subset(input,startIndex+1,k);
		
		int smallOutput2[][]=subset(input,startIndex+1,k-input[startIndex]);
		
		int output[][]=new int[smallOutput1.length+smallOutput2.length][];
		int index=0;
		
		for(int i=0;i<smallOutput1.length;i++) {
			output[index++]=smallOutput1[i];
		}
		for(int i=0;i<smallOutput2.length;i++) {
			output[index]=new int[smallOutput2[i].length+1];
			output[index][0]=input[startIndex];
			for(int j=0;j<smallOutput2[i].length;j++) {
				output[index][j+1]=smallOutput2[i][j];
			}
			index++;
		}
		return output;
	}
	private static int[][] subset(int input[],int k){
		return subset(input,0,k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		int output[][]=subset(a,k);
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}

}
