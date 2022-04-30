package recursion;

import java.util.Scanner;

public class ReturnAllCodes {
	private static char getChar(int n) {
		return (char)(96+n);
	}
	private static String[] getCode(String input) {
		if(input.length()==0) {
			String output[]= {""};
			return output;
		}
		int firstDigit=(input.charAt(0)-'0');
		String smallOutput1[]=getCode(input.substring(1));
		String smallOutput2[]=new String[0];
		
		int firstTwoDigit=0;
		if(input.length()>=2) {
			firstTwoDigit=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
			if(firstTwoDigit>=10&&firstTwoDigit<=26) {
				smallOutput2=getCode(input.substring(2));
			}
		}
		String output[]=new String[smallOutput1.length+smallOutput2.length];
		int k=0;
		for(String s:smallOutput1) {
			char firstChar=getChar(firstDigit);
			output[k++]=firstChar+s;
		}
		for(String s:smallOutput2) {
			char firstTwoChar=getChar(firstTwoDigit);
			output[k++]=firstTwoChar+s;
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String output[]=getCode(s);
		for(String str:output) {
			System.out.println(str);
		}

	}

}
