package linkedlist;

import java.util.Scanner;

public class AppendLastNToFirst {
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
			Node<Integer> temp=head;
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
			}
			System.out.println();
		}
		public static int length(Node<Integer> head) {
			if(head==null)
				return 0;
			int i=0;
			while(head!=null) {
				head=head.next;
				i++;
			}
			return i;
		}
		public static Node<Integer> append_last_to_first(Node<Integer> head,int len,int num){
			int i=len-num;
			int k=1;
			Node<Integer> temp=head;
			Node<Integer> temp1=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			while(k<i) {
				temp1=temp1.next;
				k++;
			}
			temp.next=head;
			head=temp1.next;
			temp1.next=null;
			
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
			int len=length(head);
			System.out.println(len);
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			head=append_last_to_first(head,len,num);
			print(head);
		}

	}


