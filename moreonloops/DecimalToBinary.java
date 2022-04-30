package moreonloops;

import java.util.Scanner;

public class DecimalToBinary {

		// TODO Auto-generated method stub
		private static void dtb(int n) {
			long r=0,s=0,k=1;
			while(n>0) {
				r=n%2;
				s+=r*k;
				k=k*10;
				n=n/2;
			}
			System.out.println("binary number="+s);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n");
			n=sc.nextInt();
			dtb(n);
		}

}
