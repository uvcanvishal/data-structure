package moreonloops;

import java.util.Scanner;

public class SumOrProduct {
	private static void sorp(int n,int c) {
		int sum=0,product=1;
		switch(c) {
		case 1:
			sum=(n*(n+1))/2;
			System.out.println("sum="+sum);
			break;
		case 2:
			for(int i=1;i<=n;i++) {
				product=product*i;
			}
			System.out.println("product="+product);
			break;
			default:
				System.out.println("-1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		sorp(n,choice);

	}

}
