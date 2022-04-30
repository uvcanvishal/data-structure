package recursion;

import java.util.Scanner;

public class PairStar {
	private static String pairStar(String s) {
		if(s.length()==1)
			return s;
		String out=pairStar(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			out=s.charAt(0)+"*"+s.charAt(1)+out.substring(1);
		else
			out=s.charAt(0)+out;
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(pairStar(s));
	}

}
