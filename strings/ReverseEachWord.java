package strings;

import java.util.Scanner;

public class ReverseEachWord {
	private static String reverseEachWord(String s) {
		int i=0,start=0,j=0,n=s.length();
		String reversedWord="",result="";
		while(i<n) {
			if(s.charAt(i)==' ') {
				j=i-1;
				while(j>=start) {
					reversedWord+=s.charAt(j);
					j--;
				}
				start=i+1;
				result=result+reversedWord+" ";
			}
			reversedWord="";
			i++;
		}
		j=s.length()-1;
		while(j>=start)
		{
			reversedWord+=s.charAt(j);
			j--;
		}
		result=result+reversedWord;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverseEachWord(s));
	}

}
