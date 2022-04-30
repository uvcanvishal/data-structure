package moreonloops;

import java.util.Scanner;

public class SquareRoot2 {
	private static long sqrt(int n) {
		if(n==0||n==1)
			return n;
		long result=1,i=1;
		while(result<=n) {
			i++;
			result=i*i;
		}
		return i-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;                           
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println(sqrt(n)); 
	}
}
