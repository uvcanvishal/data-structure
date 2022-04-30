package basics;

import java.util.Scanner;

public class CheckCharacter {
	private static void checkChar(char ch) {
		if(Character.isUpperCase(ch))
			System.out.println("1");
		else if(Character.isLowerCase(ch))
			System.out.println("0");
		else
			System.out.println("-1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		checkChar(ch);

	}

}
