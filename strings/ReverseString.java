package strings;

import java.util.Scanner;

public class ReverseString {
	private static String reverseStrings(String s) {
		if(s==null||s.length()==0)
			return s;
		StringBuilder ans=new StringBuilder();
		if(s.length()==1&&s.charAt(0)==' ')
			return ans.toString();
		int start=s.length()-1;
		while(start>=0) {
			if(s.charAt(start)==' ')
				start--;
			else
			{
				if(ans.length()>0)
					ans.append(" ");
				int j=start;
				while(j>=0&&s.charAt(j)!=' ')
					j--;
				ans.append(s.substring(j+1,start+1));
				start=j;
			}
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverseStrings(s));
	}

}
