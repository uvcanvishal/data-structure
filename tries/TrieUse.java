package tries;

import java.util.ArrayList;
import java.util.Scanner;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t=new Trie();
		/*t.add("this");
		t.add("and");
		System.out.println(t.search("and"));
		t.add("news");
		System.out.println(t.countWords());
		System.out.println(t.search("news"));
		t.remove("news");
		System.out.println(t.search("news"));
		System.out.println(t.countWords());*/
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.next());
		}
		String k=sc.next();
		//System.out.println(t.patternMatching(arr, k));*/
		//System.out.println(t.palindromePair(arr));
		t.autoComplete(arr,k);
	}

}
