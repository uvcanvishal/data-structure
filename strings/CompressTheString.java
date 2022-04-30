package strings;

import java.util.Scanner;

public class CompressTheString {
	private static String compressTheString(String s) {
		int i=0,j=0,count=0,n=s.length();
		String result="";
		while(i<n) {
			while(j<n&&(s.charAt(i)==s.charAt(j))) {
				j++;
			}
			count=j-i;
			if(count!=1)
			{
				result+=s.charAt(i)+""+count;
			}else
			{
				result+=s.charAt(i);
			}
			i=j;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(compressTheString(s));
	}

}
