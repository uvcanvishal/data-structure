package recursion;

import java.util.Scanner;

public class PrintSubsequence {
	private static void subsequence(String s,String outputsofar) {
		if(s.length()==0) {
			System.out.println(outputsofar);
			return;
		}
		subsequence(s.substring(1),outputsofar);
		subsequence(s.substring(1),outputsofar+s.charAt(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		subsequence(s,"");

	}

}
