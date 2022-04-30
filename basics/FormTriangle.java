package basics;

import java.util.Scanner;

public class FormTriangle {
	private static void triangle(int a,int b,int c) {
		if(a+b>c || b+c>a || a+c>b)
			System.out.println("Valid triangle");
		else
			System.out.println("Invalid triangle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		triangle(a,b,c);
		sc.close();
	}

}
