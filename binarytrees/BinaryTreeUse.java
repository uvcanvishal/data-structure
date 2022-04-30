package binarytrees;

import java.awt.DisplayMode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter the root data");
		int rootData=s.nextInt();
		if(rootData==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		String s=root.data+" ";
		if(root.left!=null) {
			s+="L:"+root.left.data;
		}
		if(root.right!=null)
		{
			s+="R:"+root.right.data;
		}
		System.out.println(s);
		print(root.left);
		print(root.right);
	}
	public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner s){
		System.out.println("Enter the root data");
		int rootData=s.nextInt();
		if(rootData==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front=null;
			try {
				front=pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter the left child for:"+front.data);
			int leftChild=s.nextInt();
			if(leftChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter the right child for:"+front.data);
			int rightChild=s.nextInt();
			if(rightChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right=child;
			}
		}
		return root;
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front=null;
			String s="";
			try {
				front=pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s+=front.data+" ";
			if(front.left!=null) {
				s+="L:"+front.left.data;
				pendingNodes.enqueue(front.left);
			}
			else
			{
				s+="L:"+"-1";
			}
			if(front.right!=null) {
				s+="R:"+front.right.data;
				pendingNodes.enqueue(front.right);
			}
			else
			{
				s+="R:"+"-1";
			}
			System.out.println(s);
		}
	}
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int ans=1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		return ans;
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int left=height(root.left);
		int right=height(root.right);
		return 1+Math.max(left, right);
	}
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int option1=height(root.left)+height(root.right);
		int option2=diameter(root.left);
		int option3=diameter(root.right);
		return Math.max(option1,Math.max(option2,option3));
	}
	public static Pair<Integer,Integer> diameterBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			Pair<Integer,Integer> output=new Pair<>();
			output.first=0;
			output.second=0;
			return output;
		}
		Pair<Integer,Integer> lo=diameterBetter(root.left);
		Pair<Integer,Integer> ro=diameterBetter(root.right);
		int height=1+Math.max(lo.first,ro.first);
		int option1=lo.first+ro.first;
		int option2=lo.second;
		int option3=ro.second;
		int diameter=Math.max(option1,Math.max(option2, option3));
		Pair<Integer, Integer> output=new Pair<>();
		output.first=height;
		output.second=diameter;
		return output;
	}
	public static void preorder(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void inorder(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static BinaryTreeNode<Integer> buildTreeUsingPreInHelper(int in[],int pre[],int inS,int inE,int preS,int preE){
		if(inS>inE)
			return null;
		int rootData=pre[preS];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		int rootIndex=-1;
		for(int i=inS;i<=inE;i++) {
			if(in[i]==rootData)
			{
				rootIndex=i;
				break;
			}
		}
		if(rootIndex==-1)
			return null;
		int leftInS=inS;
		int leftInE=rootIndex-1;
		int leftPreS=preS+1;
		int leftPreE=leftInE-leftInS+leftPreS;
		int rightInS=rootIndex+1;
		int rightInE=inE;
		int rightPreS=leftPreE+1;
		int rightPreE=preE;
		root.left=buildTreeUsingPreInHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
		root.right=buildTreeUsingPreInHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeUsingPreIn(int in[],int pre[]){
		return buildTreeUsingPreInHelper(in,pre,0,in.length-1,0,pre.length-1);
	}
	public static BinaryTreeNode<Integer> buildTreeUsingPostInHelper(int in[],int post[],int inS,int inE,int postS,int postE){
		if(inS>inE)
			return null;
		int rootData=post[postE];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		int rootIndex=-1;
		for(int i=inS;i<=inE;i++) {
			if(in[i]==rootData)
			{
				rootIndex=i;
				break;
			}
		}
		if(rootIndex==-1)
			return null;
		int leftInS=inS;
		int leftInE=rootIndex-1;
		int leftPostS=postS;
		int leftPostE=leftInE-leftInS+leftPostS;
		int rightInS=rootIndex+1;
		int rightInE=inE;
		int rightPostS=leftPostE+1;
		int rightPostE=postE-1;
		root.left=buildTreeUsingPostInHelper(in, post, leftInS, leftInE, leftPostS, leftPostE);
		root.right=buildTreeUsingPostInHelper(in, post, rightInS, rightInE, rightPostS, rightPostE);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeUsingPostIn(int in[],int post[]){
		return buildTreeUsingPostInHelper(in,post,0,in.length-1,0,post.length-1);
	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x) {
		if(root==null)
			return false;
		if(root.data==x)
			return true;
		if(isNodePresent(root.left, x))
			return true;
		if(isNodePresent(root.right, x))
			return true;
		return false;
	}
	public static void mirror(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	public static int sumOfAllNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int ans=root.data;
		ans+=sumOfAllNodes(root.left);
		ans+=sumOfAllNodes(root.right);
		return ans;
	}
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null)
			return true;
		int lh=height(root.left);
		int rh=height(root.right);
		if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}
	public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root) {
		if(root==null)
			return null;
		if(root.left==null&&root.right==null)
			return null;
		root.left=removeLeaf(root.left);
		root.right=removeLeaf(root.right);
		return root;
	}
	public static ArrayList<Node<Integer>> levelWiseLinkedList(BinaryTreeNode<Integer> root){
		if(root==null) {
			ArrayList<Node<Integer>> output=new ArrayList<>();
			output.add(null);
			return output;
		}
		Node<Integer> llist;
		QueueUsingLL<BinaryTreeNode<Integer>> q=new QueueUsingLL<>();
		q.enqueue(root);
		ArrayList<Node<Integer>> output=new ArrayList<>();
		while(!q.isEmpty()) {
			int levelNodes=q.size();
			Node<Integer> head=null;
			Node<Integer> tail=null;
			while(levelNodes>0) {
				try {
			BinaryTreeNode<Integer> cur=q.dequeue();
			Node<Integer> in=new Node<Integer>(cur.data);
			if(head==null)
			{
				head=in;
				tail=in;
			}else {
				tail.next=in;
				tail=tail.next;
			}
			if(cur.left!=null)
				q.enqueue(cur.left);
			if(cur.right!=null)
				q.enqueue(cur.right);
			levelNodes--;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			output.add(head);
		}
		return output;
	}
	public static void display(ArrayList<Node<Integer>> a) {
		Iterator<Node<Integer>> it=a.iterator();
		while(it.hasNext()) {
			Node<Integer> head=(Node<Integer>)it.next();
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
			}
			System.out.println();
		}
	}
	public static void zigZagOrder(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		Stack<BinaryTreeNode<Integer>> s1=new Stack<>();
		Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
		Stack<BinaryTreeNode<Integer>> temp;
		s1.push(root);
		boolean leftToRight=false;
		while(!s1.isEmpty()) {
			BinaryTreeNode<Integer> cur=s1.pop();
			System.out.print(cur.data+" ");
			if(!leftToRight) 
			{
				if(cur.left!=null) {
					s2.push(cur.left);
				}
				if(cur.right!=null){
					s2.push(cur.right);
				}
			}
			else
			{
				if(cur.right!=null) {
					s2.push(cur.right);
				}
				if(cur.left!=null){
					s2.push(cur.left);
				}
		    }
			if(s1.isEmpty()) {
				leftToRight=!leftToRight;
				System.out.println();
				temp=s1;
				s1=s2;
				s2=temp;
			}
		}
	}
	public static void noSiblings(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		if(root.left!=null&&root.right!=null) {
			noSiblings(root.left);
			noSiblings(root.right);
		}
		else if(root.right!=null) {
			System.out.println(root.right.data+" ");
			noSiblings(root.right);
		}
		else if(root.left!=null) {
			System.out.println(root.left.data);
			noSiblings(root.left);
		}
	}
	public static Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> largestBSTSubtree(BinaryTreeNode<Integer> root){
		if(root==null) {
			Pair<Integer,Integer> p1=new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
			Pair<Boolean,Integer> p2=new Pair<>(true,0);
			Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> ans=new Pair<>(p1,p2);
			return ans;
		}
		Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> l=largestBSTSubtree(root.left);
		Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> r=largestBSTSubtree(root.right);
		Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> ans;
		if(l.second.first==true && r.second.first==true) {
			if(root.data>l.first.second && root.data<=r.first.first) {
				Pair<Integer,Integer> p1=new Pair<>(Math.min(root.data,Math.min(l.first.first,r.first.first)),Math.max(root.data,Math.max(l.first.second,r.first.second)));
				Pair<Boolean,Integer> p2=new Pair<>(true,1+Math.max(l.second.second, r.second.second));
				ans=new Pair<>(p1,p2);
			}
			else
			{
				Pair<Integer,Integer> p1=new Pair<>(Math.min(root.data,Math.min(l.first.first,r.first.first)),Math.max(root.data,Math.max(l.first.second,r.first.second)));
				Pair<Boolean,Integer> p2=new Pair<>(false,Math.max(l.second.second, r.second.second));
				ans=new Pair<>(p1,p2);
			}
		}else {
			Pair<Integer,Integer> p1=new Pair<>(Math.min(root.data,Math.min(l.first.first,r.first.first)),Math.max(root.data,Math.max(l.first.second,r.first.second)));
			Pair<Boolean,Integer> p2=new Pair<>(false,Math.max(l.second.second, r.second.second));
			ans=new Pair<>(p1,p2);
		}
		return ans;
	}
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		BinaryTreeNode<Integer> duplicateNode=new BinaryTreeNode<Integer>(root.data);
		duplicateNode.left=root.left;
		root.left=duplicateNode;
		insertDuplicateNode(duplicateNode.left);
		insertDuplicateNode(root.right);
		return;
	}
	public static int LCA(BinaryTreeNode<Integer> root,int x,int y) {
		if(root==null)
			return -1;
		else if(root.data==x || root.data==y)
			return root.data;
		else
		{
			int left=LCA(root.left,x,y);
			int right=LCA(root.right,x,y);
			if(left!=-1 && right!=-1)
				return root.data;
			else if(left!=-1)
				return left;
			else
				return right;
		}
	}
	public static void inorderForPair(BinaryTreeNode<Integer> root,ArrayList<Integer> arr) {
		if(root==null)
			return;
		inorderForPair(root.left, arr);
		arr.add(root.data);
		inorderForPair(root.right, arr);
	}
	public static void pairSumBinaryTree(BinaryTreeNode<Integer> root,int s) {
		ArrayList<Integer> arr=new ArrayList<>();
		inorderForPair(root,arr);
		Collections.sort(arr);
		System.out.println(arr);
		int i=0,j=arr.size()-1;
		while(i<j) {
			if(arr.get(i)+arr.get(j)==s) {
				System.out.println(arr.get(i)+" "+arr.get(j));
				i++;
				j--;
			}else if(arr.get(i)+arr.get(j)<s) {
				i++;
			}else {
				j--;
			}
		}
	}
	public static void pathSumRootToLeaf(BinaryTreeNode<Integer> root,int k,String s) {
		if(root==null)
			return;
		if(root.left==null && root.right==null && k==root.data)
		{
			System.out.println(s+root.data);
			return;
		}
		s=s+root.data+" ";
		pathSumRootToLeaf(root.left, k-root.data, s);
		pathSumRootToLeaf(root.right, k-root.data, s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*BinaryTreeNode<Integer> root=takeInput(sc);
		print(root);*/
		BinaryTreeNode<Integer> root=takeInputLevelWise(sc);
		printLevelWise(root);
		/*System.out.println("Total Number of Nodes are:"+countNodes(root));
		System.out.println("Diameter of binary tree:"+diameter(root));
		System.out.println("Diameter of binary tree using better time complexity:"+diameterBetter(root).second);
		System.out.println("height of binary tree:"+diameterBetter(root).first);
		System.out.println("Preorder");
		preorder(root);
		System.out.println("\nPostorder");
		postorder(root);
		System.out.println("\nInorder");
		inorder(root);
		int in[]= {4,2,5,1,3,7};
		int pre[]= {1,2,4,5,3,7};
		BinaryTreeNode<Integer> root=buildTreeUsingPreIn(in,pre);
		printLevelWise(root);
		int post[]= {8,4,5,2,6,7,3,1};
		int in[]= {4,8,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root=buildTreeUsingPostIn(in,post);
		printLevelWise(root);
		System.out.println("Enter the element to be checked in the tree");
		int g=sc.nextInt();
		System.out.println(isNodePresent(root,g));
		mirror(root);
		printLevelWise(root);
		System.out.println("sum of all nodes:"+sumOfAllNodes(root));
		System.out.println("is balanced:"+isBalanced(root));
		System.out.println();
		BinaryTreeNode<Integer> root1=removeLeaf(root);
		printLevelWise(root1);
		System.out.println();
		ArrayList<Node<Integer>> a=levelWiseLinkedList(root);
		display(a);
		zigZagOrder(root);
		noSiblings(root);
		Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> ans=largestBSTSubtree(root);
		System.out.println(ans.second.second);
		insertDuplicateNode(root);
		printLevelWise(root);
		System.out.println(LCA(root,2,10));
		pairSumBinaryTree(root,15);*/
		pathSumRootToLeaf(root, 13, "");
	}

}
