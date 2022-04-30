package linkedlist;

import java.util.Scanner;

public class BubbleSortLL{
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
			public static int length(Node<Integer> head) {
				int i=1;
				while(head.next!=null) {
					head=head.next;
					i++;
				}
				return i;
			}
			public static Node<Integer> bubbleSortLL(Node<Integer> head){
				if(head==null||head.next==null)
					return head;
				int len=length(head);
				for(int i=0;i<len-1;i++) {
					Node<Integer> prev=null,cur=head,next=cur.next;
					while(cur.next!=null) {
						if(cur.data>cur.next.data) {
							if(prev==null) {
								cur.next=next.next;
								next.next=cur;
								prev=next;
								head=prev;
							}
							else {
								next=cur.next;
								cur.next=next.next;
								next.next=cur;
								prev.next=next;
								prev=next;
							}			
						}
						else
						{
							prev=cur;
							cur=cur.next;
						}
					}
				}
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
			    head=bubbleSortLL(head);
			    print(head);
			}

		}











