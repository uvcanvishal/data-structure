package recursion;

import java.util.Scanner;

public class ReturnSubset {
	private static int[][] subset(int a[],int startIndex){
		if(startIndex==a.length)
		{
			int output[][]=new int[1][0];
			return output;
		}
		int smallOutput[][]=subset(a,startIndex+1);
		int output[][]=new int[2*smallOutput.length][];
		int k=0;
		for(int i=0;i<smallOutput.length;i++) {
			output[i]=new int[smallOutput[i].length];
			for(int j=0;j<smallOutput[i].length;j++) {
				output[i][j]=smallOutput[i][j];
			}
			k++;
		}
		for(int i=0;i<smallOutput.length;i++) {
			output[k]=new int[smallOutput[i].length+1];
			output[k][0]=a[startIndex];
			for(int j=1;j<=smallOutput[i].length;j++) {
				output[k][j]=smallOutput[i][j-1];
			}
			k++;
		}
		return output;
	}
	private static int[][] subset(int a[]){
		return subset(a,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int output[][]=subset(a);
		for(int i=0;i<output.length;i++)
		{
			for(int j=0;j<output[i].length;j++)
			{
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}

}
