package tries;

import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;
	public TrieNode(char data) {
		this.data=data;
		isTerminating=false;
		childCount=0;
		children=new TrieNode[26];
	}
}
public class Trie {
	private static TrieNode root;
	private static int numWords;
	public Trie() {
		root=new TrieNode('\0');
	}
	private static boolean add(TrieNode root,String word) {
		if(word.length()==0) {
			if(root.isTerminating)
				return false;
			else {
			root.isTerminating=true;
			return true;
			}
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		return add(child,word.substring(1));
	}
	public static void add(String word) {
		if(add(root,word))
				numWords++;
	}
	private static boolean search(TrieNode root,String word) {
		if(word.length()==0) {
			return root.isTerminating;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		return search(child,word.substring(1));
	}
	public static boolean search(String word) {
		return search(root,word);
	}
	private boolean remove(TrieNode root,String word) {
		if(word.length()==0) {
			if(root.isTerminating)
			{
			root.isTerminating=false;
			return true;
			}
			else
			{
				return false;
			}
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		boolean ans=remove(child,word.substring(1));
		if(!child.isTerminating && child.childCount==0) {
			root.children[childIndex]=null;
			child=null;
			root.childCount--;
		}
		return ans;
	}
	public void remove(String word) {
		if(remove(root,word))
			numWords--;
	}
	public int countWords() {
		return numWords;
	}
	private static boolean search1(TrieNode root,String word) {
		if(word.length()==0) {
			return true;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		return search1(child,word.substring(1));
	}
	public static boolean search1(String word) {
		return search1(root,word);
	}
	public static boolean patternMatching(ArrayList<String> a,String s) {
		for(int i=0;i<a.size();i++) {
			String word=a.get(i);
			for(int j=0;j<word.length();j++)
				add(word.substring(j));
		}
		return search1(s);
	}
	private static String reverse(String s) {
		String newStr="";
		while(s.length()>0) {
			newStr=s.charAt(0)+newStr;
			s=s.substring(1);
		}
		return newStr;
	}
	public static boolean palindromePair(ArrayList<String> a) {
		ArrayList<String> s=new ArrayList<>();
		for(int i=0;i<a.size();i++) {
			add(a.get(i));
			String st=reverse(a.get(i));
			s.add(st);
		}
		for(int i=0;i<s.size();i++) {
			if(search(s.get(i)))
				return true;
		}
		return false;
	}
	public static TrieNode findWords(TrieNode root,String word) {
		if(word.length()==0)
			return root;
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		//System.out.println(root.children[childIndex].data);
		if(child==null)
			return null;
		return findWords(child,word.substring(1));
	}
	public static void allWords(TrieNode root,String word,String output) {
		if(root==null)
		{
			//System.out.println("hello");
			return;
		}
		if(root.childCount==0) {
			//if(output.length()>0)
				System.out.println(word+output);
			return;
		}
		if(root.isTerminating) {
				System.out.println(word+output);
			}
		for(int i=0;i<root.children.length;i++) {
			if(root.children[i]!=null) {
				String ans=output+root.children[i].data;
			    allWords(root.children[i],word,ans);
			}
		}
	}
	public static void autoComplete(ArrayList<String> a,String word) {
		for(int i=0;i<a.size();i++)
			add(a.get(i));
		if(root==null || root.childCount==0)
			return;
		TrieNode node=findWords(root,word);
		//System.out.println(node.data);
		String output="";
		allWords(node,word,output);
	}
}
