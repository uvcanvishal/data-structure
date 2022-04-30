package basics;

import java.util.Scanner;

public class DoubleToIntegerAndDecimalParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		String s=Double.toString(num);
		String st="0"+s.substring(s.indexOf("."));
		double n=Double.parseDouble(st);
		System.out.println((int)num);
		System.out.println(n);

	}

}
