package basics;

import java.util.Scanner;

public class LargestOfN {
	private static int largest(int n,Scanner sc) {
		int i=1,k=Integer.MIN_VALUE;
		while(i<=n) {
			int a=sc.nextInt();
			k=a;
			i++;
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println(largest(n,sc));
		sc.close();

	}

}
