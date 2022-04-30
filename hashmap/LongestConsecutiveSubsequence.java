package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
	public static ArrayList<Integer> longestConsecutiveSubsequence(int a[]){
		HashMap<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], true);
		}
		int maxlength=0,start=0;
		for(int i=0;i<a.length;i++) {
			int temp=a[i]+1;
			if(!map.containsKey(temp)) {
				int j=a[i];
				while(map.containsKey(j)) {
					map.put(j, false);
					j--;
				}
			if(maxlength<a[i]-j) {
				maxlength=a[i]-j;
				start=j+1;
			}else if(maxlength==a[i]-j) {
				if(start<j+1) {
					start=j+1;
				}
			}
			}
		}
		ArrayList<Integer> output=new ArrayList<>();
		for(int i=start;i<start+maxlength;i++) {
			output.add(i);
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> arr=longestConsecutiveSubsequence(a);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
