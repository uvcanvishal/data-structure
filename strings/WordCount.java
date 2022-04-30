package strings;

import java.util.Scanner;

public class WordCount {
	private static int countwords(String s) {
		System.out.println(s.length());
		if(s==null||s.isEmpty())
			return 0;
		int wc=0,eol=s.length()-1;
		boolean isword=false;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])&&i!=eol) {
				isword=true;
			}
			else if(!Character.isLetter(ch[i])&& isword) {
				wc++;
				isword=false;
			}
			else if(Character.isLetter(ch[i])&& i==eol)
			{
				wc++;
			}
		}
		return wc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(countwords(s));
	}

}
