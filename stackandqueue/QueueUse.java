package stackandqueue;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QueueUsingArray queue=new QueueUsingArray();
		QueueUsingLL<Integer> queue=new QueueUsingLL<>();
		for(int i=0;i<15;i++)
				queue.enqueue(i+1);
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
