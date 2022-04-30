package basics;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Double avg=(double)(a+b+c)/3;
		System.out.println(avg);
		sc.close();
	}

}
