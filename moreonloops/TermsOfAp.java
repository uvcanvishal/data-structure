package moreonloops;

import java.util.Scanner;

public class TermsOfAp {
	private static void ap(int x)
	{
		int count=0,n=1,k;
		while(count<10) {
			k=(3*n)+2;
				if(k%4!=0)
				{
					System.out.println(k+" ");
					count++;
				}
				n=n+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		x=sc.nextInt();
		ap(x);

	}

}
