package linkedlist;

import java.util.Scanner;

public class DeleteMN{
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
			public static Node<Integer> deleteMN(Node<Integer> head,int m,int n) {
				Node<Integer> cur,rem;
				cur=head;
				while(cur!=null) {
					int cnt=m-1;
					while((cnt-->0)&&(cur!=null)) {
						cur=cur.next;
					}
					if(cur==null)
						return head;
					rem=cur.next;
					cnt=n;
					while((cnt-->0)&&(rem!=null)) {
						rem=rem.next;
					}
					cur.next=rem;
					cur=rem;
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
				Scanner sc=new Scanner(System.in);
				int m=sc.nextInt();
				int n=sc.nextInt();
			    head=deleteMN(head,m,n);
			    print(head);
			}

		}









