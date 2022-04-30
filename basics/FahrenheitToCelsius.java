package basics;

import java.util.Scanner;

public class FahrenheitToCelsius {
	private static void fahrenheitToCelsius(int s,int e,int w) {
		int i=s;
		while(i<=e) {
			int c=((i-32)*5)/9;
			System.out.println(i+" "+c);
			i=i+w;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		int w=sc.nextInt();
		fahrenheitToCelsius(s,e,w);

	}

}
