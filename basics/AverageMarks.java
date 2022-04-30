package basics;

import java.util.Scanner;

public class AverageMarks {
	private static void averageMarks(char s,int m1,int m2,int m3) {
		System.out.println(s);
		System.out.println((m1+m2+m3)/3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    char s = sc.next().charAt(0);
	    int m1 = sc.nextInt();
	    int m2 = sc.nextInt();
	    int m3 = sc.nextInt();
	    averageMarks(s,m1,m2,m3);
	}

}
