package linkedlist;

import java.util.Scanner;

public class SwapTwoNode{
			public static Node<Integer> takeInput(){
				Node<Integer> head=null;
				Node<Integer> tail=null;
				Scanner sc=new Scanner(System.in);
				int data=sc.nextInt();
				while(data!=-1) {
					Node<Integer> newNode=new Node<Integer>(data);
					if(head==null) {
						head=newNode;
						tail=newNode;
					}else {
						tail.next=newNode;
						tail=newNode;
					}
					data=sc.nextInt();
				}
				return head;
			}
			public static void print(Node<Integer> head) {
				while(head!=null) {
					System.out.print(head.data+" ");
					head=head.next;
				}
				System.out.println();
			}
			public static Node<Integer> swapTwoNode(Node<Integer> head,int i,int j) {
				int pos=0;
				Node<Integer> temp=head,p1=null,p2=null,c1=null,c2=null,prev=null;
				while(temp!=null) {
					if(pos==i)
					{
						p1=prev;
						c1=temp;
					}else if(pos==j)
					{
						p2=prev;
						c2=temp;
					}
					prev=temp;
					temp=temp.next;
					pos++;
				}
				if(p1!=null) 
					p1.next=c2;
				else
					head=c2;
				if(p2!=null)
					p2.next=c1;
				else
					head=c1;
				Node<Integer> temp1=c2.next;
				c2.next=c1.next;
				c1.next=temp1;
				return head;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*Node<Integer> node1=new Node<Integer>(10);
				Node<Integer> node2=new Node<Integer>(20);
				Node<Integer> node3=new Node<Integer>(30);
				node1.next=node2;
				node2.next=node3;*/
				Node<Integer> head=takeInput();
				print(head);
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				int j=sc.nextInt();
			    head=swapTwoNode(head,i,j);
			    print(head);
			}

		}









