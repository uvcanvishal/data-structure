package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
	/*public static TreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter next node data");
		int n=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter the number of child for:"+n);
		int childCount=s.nextInt();
		for(int i=0;i<childCount;i++) {
			TreeNode<Integer> child=takeInput(s);
			root.children.add(child);
		}
		return root;
	}*/
	/*public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}*/
	public static TreeNode<Integer> takeInputLevelWise(Scanner s){
		 System.out.println("Enter the next node data");
		 int n=s.nextInt();
		 TreeNode<Integer> root=new TreeNode<Integer>(n);
		 QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		 pendingNodes.enqueue(root);
		 while(!pendingNodes.isEmpty()) {
			 TreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return null;
			}
			 System.out.println("Enter the number of children for "+front.data);
			 int childCount=s.nextInt();
			 for(int i=0;i<childCount;i++) {
				 System.out.println("Enter the "+(i+1)+"th child data for "+front.data);
				 int child=s.nextInt();
				 TreeNode<Integer> childNode=new TreeNode<Integer>(child);
				 front.children.add(childNode);
				 pendingNodes.enqueue(childNode);
			 }
		 }
		 return root;
	}
	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			String s="";
			try {
				TreeNode<Integer> front=pendingNodes.dequeue();
				s=front.data+":";
				for(int i=0;i<front.children.size();i++) {
					s+=front.children.get(i).data+",";
					pendingNodes.enqueue(front.children.get(i));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(s);
		}
	}
	public static int numNodes(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count+=numNodes(root.children.get(i));
		}
		return count;
	}
	public static int largestNode(TreeNode<Integer> root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int largest=largestNode(root.children.get(i));
			if(largest>ans)
				ans=largest;
		}
		return ans;
	}
	public static void depth(TreeNode<Integer> root,int k) {
		if(k<0) {
			return;
		}
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			depth(root.children.get(i),k-1);
		}
	}
	public static int height(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.children.size()==0)
			return 1;
		int max=1;
		for(int i=0;i<root.children.size();i++) {
			int h=1+height(root.children.get(i));
			if(h>max)
				max=h;
		}
		return max;
	}
	public static int countLeafNode(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.children.size()==0)
			return 1;
		int c=0;
		for(int i=0;i<root.children.size();i++) {
			c+=countLeafNode(root.children.get(i));
		}
			return c;
	}
	public static void preorder(TreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preorder(root.children.get(i));
		}
	}
	public static void postorder(TreeNode<Integer> root) {
		if(root==null)
			return;
		for(int i=0;i<root.children.size();i++) {
			postorder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	public static void levelWise(TreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.println(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			levelWise(root.children.get(i));
			System.out.println(root.data+" ");
		}
	}
	public static int nodesGreaterThanX(TreeNode<Integer> root,int x) {
		if(root==null)
			return 0;
		int c=0;
		if(root.data>x) {
			c++;
		}
		for(int i=0;i<root.children.size();i++) {
			c+=nodesGreaterThanX(root.children.get(i), x);
		}
		return c;
	}
	public static int sumOfAllNodes(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		int k=root.data;
		for(int i=0;i<root.children.size();i++) {
			k+=sumOfAllNodes(root.children.get(i));
		}
		return k;
	}
	public static boolean checkX(TreeNode<Integer> root,int x) {
		if(root==null)
			return false;
		if(root.data==x)
		{
			return true;
		}
		for(int i=0;i<root.children.size();i++) {
			if(checkX(root.children.get(i), x))
				return true;
		}
		return false;
	}
	public static int sumNode(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		int s=root.data;
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data;
		}
		return s;
	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root==null)
			return null;
		int maxSum=sumNode(root);
		TreeNode<Integer> result=root;
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> temp=maxSumNode(root.children.get(i));
			int curSum=sumNode(temp);
			if(curSum>maxSum) {
				maxSum=curSum;
				result=temp;
			}
		}
		return result;
	}
	public static boolean structurallyIdentical(TreeNode<Integer> root1,TreeNode<Integer> root2) {
		if(root1==null)
		{
			if(root2==null)
			return true;
			else
			return false;
		}
		if(root1.data != root2.data) {
			return false;
		}
		if(root1.children.size()!=root2.children.size())
		{
			return false;
		}
		for(int i=0;i<root1.children.size();i++) {
			if(!structurallyIdentical(root1.children.get(i),root2.children.get(i)))
				return false;
		}
		return true;
	}
	public static TreeNode<Integer> nextLargerElement(TreeNode<Integer> root,int n){
		if(root==null)
			return null;
		TreeNode<Integer> result=null;
		if(root.data>n)
			result=root;
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> temp=nextLargerElement(root.children.get(i), n);
			if(result==null||result.data>temp.data)
				result=temp;
		}
		return result;
	}
	/*public static void secondLargestHelper(TreeNode<Integer> root,TreeNode<Integer> first,TreeNode<Integer> second) {
		if(first==null)
			first=root;
		if(root.data>first.data)
		{
			second=first;
			first=root;
		}else if(second==null || root.data>second.data)
		{
			second=root;
		}
		for(int i=0;i<root.children.size();i++)
			secondLargestHelper(root.children.get(i), first, second);
	}*/
	public static TreeNode<Integer> secondLargest(TreeNode<Integer> root){
		if(root==null)
			return null;
		if(root.children.size()==0)
			return null;
		TreeNode<Integer> first=root;
		TreeNode<Integer> second=root.children.get(0);
		if(first.data<second.data) {
			second=root;
			first=root.children.get(0);
		}
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode<Integer> curr=q.poll();
			for(int i=0;i<curr.children.size();i++) {
				q.add(curr.children.get(i));
				if(curr.children.get(i).data>second.data) {
					if(curr.children.get(i).data>first.data) {
						second=first;
						first=curr.children.get(i);
					}
					else
					{
						second=curr.children.get(i);
					}
				}
			}
		}
		return second;
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root,int value) {
		if(root==null)
			return;
		root.data=value;
		for(int i=0;i<root.children.size();i++) {
			replaceWithDepthValue(root.children.get(i), value+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//TreeNode<Integer> root=takeInput(sc);
		//print(root);
		TreeNode<Integer> root=takeInputLevelWise(sc);
		printLevelWise(root);
		/*System.out.println("Total number of nodes:"+numNodes(root));
		System.out.println("Largest node:"+largestNode(root));
		System.out.println("enter the the value of k for depth");
		int k=sc.nextInt();
		depth(root,k);
		System.out.println("Height of tree:"+height(root));
		System.out.println("total leaf Nodes:"+countLeafNode(root));
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println("enter the value of x");
		int x=sc.nextInt();
		System.out.println(nodesGreaterThanX(root, x));
		System.out.println(sumOfAllNodes(root));
		System.out.println("Enter the value to check if it is present");
		int m=sc.nextInt();
		System.out.println(checkX(root, m));
		TreeNode<Integer> res=maxSumNode(root);
		System.out.println(res.data);
		TreeNode<Integer> root1=takeInputLevelWise(sc);
		System.out.println(structurallyIdentical(root, root1));
		int n=sc.nextInt();
		TreeNode<Integer> res1=nextLargerElement(root,n);
		System.out.println(res1.data);
		TreeNode<Integer> secondLarge=secondLargest(root);
		System.out.println(secondLarge.data);*/
		replaceWithDepthValue(root,0);
		printLevelWise(root);
	}

}
