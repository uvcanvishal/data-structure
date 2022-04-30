package priorityqueues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class PqComparator implements Comparator<Pair>{

	@Override
	public int compare(Pair p1, Pair p2) {
		// TODO Auto-generated method stub
		if(p1.first<p2.first)
			return -1;
		else if(p1.first>p2.first)
			return 1;
		return 0;
	}
	
}
class MINPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return -1;
		else if(o1>o2)
			return 1;
		return 0;
	}
	
}
class MAXPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		return 0;
	}
	
}
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()<o2.length())
			return 1;
		else if(o1.length()>o2.length())
			return -1;
		return 0;
	}

	
	
}

public class PriorityQueueUse {

	public static void insertIntoVirtualHeap(int a[],int i) {
		int childIndex=i;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) {
			if(a[childIndex]<a[parentIndex]) {
			int temp=a[childIndex];
			a[childIndex]=a[parentIndex];
			a[parentIndex]=temp;
			childIndex=parentIndex;
			parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
		}
	}
	public static int removeMinFromVirtualHeap(int a[],int heapSize) {
		int temp=a[0];
		a[0]=a[heapSize-1];
		heapSize--;
		int index=0;
		int leftIndex=2*index+1;
		int rightIndex=2*index+2;
		while(leftIndex<heapSize) {
			int minIndex=index;
			if(a[leftIndex]<a[minIndex])
				minIndex=leftIndex;
			if(rightIndex<heapSize && a[rightIndex]<a[minIndex])
				minIndex=rightIndex;
			if(minIndex!=index) {
				int temp1=a[index];
				a[index]=a[minIndex];
				a[minIndex]=temp1;
				index=minIndex;
				leftIndex=2*index+1;
				rightIndex=2*index+2;
			}
			else
				break;
		}
		return temp;
	}
	public static void sortKSorted(int a[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
			pq.add(a[i]);
		for(;i<a.length;i++) {
			a[i-k]=pq.remove();
			pq.add(a[i]);
		}
		for(int j=a.length-k;j<a.length;j++) {
			a[j]=pq.remove();
		}
	}
	public static void printKLargest(int a[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
			pq.add(a[i]);
		for(;i<a.length;i++) {
			int min=pq.element();
			if(min<a[i]) {
				pq.remove();
				pq.add(a[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}
	}
	public static boolean checkMaxHeap(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(2*i+1<arr.length && arr[i]<arr[2*i+1])
				return false;
			if(2*i+2<arr.length && arr[i]<arr[2*i+2])
				return false;
		}
		return true;
	}
	public static int kthLargest(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++) {
			int min=pq.element();
			if(min<arr[i]) {
			pq.remove();
			pq.add(arr[i]);
			}
		}
		return pq.remove();
	}
	public static ArrayList<Integer> mergeKSorted(ArrayList<ArrayList<Integer>> arr,int k){
		ArrayList<Integer> result=new ArrayList<>();
		PriorityQueue<Pair> pq=new PriorityQueue<>(new PqComparator());
		for(int i=0;i<k;i++)
			pq.add(new Pair(arr.get(i).get(0),i,0));
		while(pq.isEmpty()==false) {
			Pair cur=pq.remove();
			int i=cur.second;
			int j=cur.third;
			result.add(cur.first);
			if((j+1)<arr.get(i).size())
				pq.add(new Pair(arr.get(i).get(j+1),i,j+1));
		}
		return result;
	}
	public static void findMedian(int arr[]) {
		PriorityQueue<Integer> lowerHalf=new PriorityQueue<>(new MAXPQComparator());
		PriorityQueue<Integer> higherHalf=new PriorityQueue<>();
		int median;
		for(int i=1;i<=arr.length;i++) {
			if(!lowerHalf.isEmpty() && lowerHalf.peek()>arr[i-1])
			{
				lowerHalf.add(arr[i-1]);
			if(lowerHalf.size()>higherHalf.size()+1) {
				higherHalf.add(lowerHalf.poll());
			}
		}else {
			higherHalf.add(arr[i-1]);
			if(higherHalf.size()>lowerHalf.size()+1) {
				lowerHalf.add(higherHalf.poll());
			}
		}
			if(i%2==1) {
				if(higherHalf.size()>lowerHalf.size())
					median=higherHalf.peek();
				else
					median=lowerHalf.peek();
				}else {
					median=(lowerHalf.peek()+higherHalf.peek())/2;
				}
			System.out.println(median);
		}
	}
	//won't work for duplicate priority
	/*public static int buyTickets(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(new MAXPQComparator());
		for(int i=0;i<arr.length;i++)
			pq.add(arr[i]);
		int ans=0;
		while(!pq.isEmpty()) {
			int x=pq.element();
			if(x==arr[k])
				break;
			else
			{
				pq.remove();
				ans++;
			}
		}
		return ans+1;
	}*/
	public static int buyTickets(int a[],int k) {
		int yourPriority=a[k];
		int time=1;
		PriorityQueue<Integer> pq=new PriorityQueue<>(new MAXPQComparator());
		Deque<Integer> dq=new LinkedList<>();
		for(int i=0;i<a.length;i++) {
			if(i==k)
				dq.add(-1);
			else
				dq.add(a[i]);
			pq.add(a[i]);
		}
		while(pq.peek()>yourPriority || dq.peek()!=-1) {
			if(yourPriority==pq.peek()) {
				while(!dq.isEmpty()) {
					if(dq.element()==pq.peek()) {
						time++;
					}else if(dq.element()==-1) {
						return time;
					}
					dq.pop();
				}
			}
			while(dq.peek()!=pq.peek()) {
				dq.add(dq.pop());
			}
			time++;
			dq.pop();
			pq.poll();
		}
		return time;
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//MINPQComparator minpqComparator=new MINPQComparator();
		//MAXPQComparator maxpqComparator=new MAXPQComparator();
		/*StringLengthComparator slComparator=new StringLengthComparator();
		PriorityQueue<String> pq=new PriorityQueue<>(slComparator);
		//int a[]= {5,1,9,2,0};
		String a[]= {"this","at","a","their","queues"};
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}*/
		/*int arr[]= {6,2,1,3,7,5};
		findMedian(arr);*/
		int arr[]= {3,9,4};
		System.out.println(buyTickets(arr, 2));
		/*int arr[]= {4,5,3,0,1};
		System.out.println(checkMaxHeap(arr));
		int b[]= {9,4,8,7,11,3};
		System.out.println(kthLargest(b,2));*/
		/*ArrayList<ArrayList<Integer>> arl=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int n=sc.nextInt();
			ArrayList<Integer> a=new ArrayList<>();
			for(int j=0;j<n;j++) {
				a.add(sc.nextInt());
				}
			arl.add(a);
		}
		ArrayList<Integer> arr=mergeKSorted(arl,k);
		for(int i:arr) {
			System.out.print(i+" ");
		}*/
		/*int a[]= {2,4,1,9,6,8};
		int k=3;
		sortKSorted(a,k);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		/*int b[]= {2,15,8,9,12,13,20};
		printKLargest(b,3);*/
		/*int a[]= {5,1,9,2,0,6};
		for(int i=0;i<a.length;i++) {
			insertIntoVirtualHeap(a,i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			a[a.length-1-i]=removeMinFromVirtualHeap(a,a.length-i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		
		/*PriorityQueue pq=new PriorityQueue();
		int a[]= {5,1,9,2,0};
		for(int i=0;i<a.length;i++) {
			pq.insert(a[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.removeMin()+" ");
		}*/
	}

}
