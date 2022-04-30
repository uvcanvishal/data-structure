package strings;

import java.util.Scanner;

public class HighestOccurringCharacter {
	private static char highestOccurringCharacter(String s) {
		int i=0,n=s.length(),max=Integer.MIN_VALUE,index=0;
		int c[]=new int[256];
		while(i<n) {
			c[s.charAt(i)]++;
			if(c[s.charAt(i)]>max) {
				max=c[s.charAt(i)];
				index=i;
			}
			i++;
		}
		return s.charAt(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(highestOccurringCharacter(s));

	}

}
