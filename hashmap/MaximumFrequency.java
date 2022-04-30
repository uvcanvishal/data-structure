package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequency {
	
	public static int maximumFrequency(int a[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		int max=Integer.MIN_VALUE;
		int maxKey=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(map.get(a[i])>max) {
				max=map.get(a[i]);
				maxKey=a[i];
			}
		}
		return maxKey;
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
		System.out.println("maximum frequency elements is: "+maximumFrequency(a));
	}

}
