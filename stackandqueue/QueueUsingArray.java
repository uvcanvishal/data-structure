package stackandqueue;

public class QueueUsingArray {
		private int data[];
		private int rear;
		private int front;
		private int size;
		public QueueUsingArray() {
			data=new int[10];
			rear=-1;
			front=-1;
			size=0;
		}
		public QueueUsingArray(int capacity) {
			data=new int[capacity];
			rear=-1;
			front=-1;
			size=0;
		}
		int size() {
			return size;
		}
		boolean isEmpty() {
			return size==0;
		}
		int front() throws QueueEmptyException {
			if(size==0) {
				throw new QueueEmptyException();
			}
			return data[front];
		}
		void enqueue(int ele) throws QueueFullException {
			if(size==data.length)
				doubleCapacity();
			if(size==0)
				front=0;
			rear=(rear+1)%data.length;
			data[rear]=ele;
			size++;
		}
		private void doubleCapacity() {
			int temp[]=data;
			data=new int[2*temp.length];
			int index=0;
			for(int i=front;i<temp.length;i++) {
				data[index]=temp[i];
				index++;
			}
			for(int i=0;i<=front-1;i++) {
				data[index]=temp[i];
				index++;
			}
			front=0;
			rear=temp.length-1;
		}
		int dequeue() throws QueueEmptyException{
			if(size==0)
				throw new QueueEmptyException();
			int temp=data[front];
			front=(front+1)%data.length;
			size--;
			if(size==0)
			{
				front=-1;
				rear=-1;
			}
			return temp;
		}
}
