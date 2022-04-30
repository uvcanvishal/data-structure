package stackandqueue;

public class StackUse {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//StackUsingArray stack=new StackUsingArray();
		StackUsingLL<Integer> stack=new StackUsingLL<>();
		for(int i=0;i<15;i++) {
			stack.push(i+1);
		}
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO: handle exception
			}
		}

	}

}
