package recursion;

import java.util.Scanner;

public class PrintAllCodes {
	private static char getChar(int n) {
		return (char)(96+n);
	}
	private static void printCode(String input,String ans) {
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}
		int firstDigit=(input.charAt(0)-'0');
		printCode(input.substring(1),ans+getChar(firstDigit));
		
		int firstTwoDigit=0;
		if(input.length()>=2) {
			firstTwoDigit=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
			if(firstTwoDigit>=10&&firstTwoDigit<=26) {
				printCode(input.substring(2),ans+getChar(firstTwoDigit));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		printCode(s,"");
	}

}
