package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubsetZeroSum {
	public static int longestSubsetZeroSum(int a[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, -1);
		int sum=0,maxlength=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(map.containsKey(sum)) {
				maxlength=Math.max(maxlength,i-map.get(sum));
			}else {
				map.put(sum, i);
			}
		}
		return maxlength;
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
		System.out.println(longestSubsetZeroSum(a));
	}

}
