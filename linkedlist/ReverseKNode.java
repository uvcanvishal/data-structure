package linkedlist;

import java.util.Scanner;

public class ReverseKNode{
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
			public static Node<Integer> reverseKNode(Node<Integer> head,int k) {
				Node<Integer> cur=head,prev=null,tail=null,next=null,join=null,newhead=null;
				while(cur!=null) {
					int cnt=0;
					prev=null;
					join=cur;
					while(cur!=null && cnt<k) {
						next=cur.next;
						cur.next=prev;
						prev=cur;
						cur=next;
						cnt++;
					}
					if(newhead==null) {
						newhead=prev;
					}
					if(tail!=null) {
						tail.next=prev;
					}
					tail=join;
				}
				return newhead;
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
				int k=sc.nextInt();
			    head=reverseKNode(head,k);
			    print(head);
			}

		}










