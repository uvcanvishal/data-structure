package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueCharacters {
	public static String uniqueCharacters(String str) {
		HashMap<Character, Boolean> map=new HashMap<>();
		String s="";
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				s+=str.charAt(i);
				map.put(str.charAt(i), true);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(uniqueCharacters(s));
	}

}
