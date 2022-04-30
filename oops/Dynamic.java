package oops;

public class Dynamic {
	protected int data[]= {0};
	protected int nextIndex;
	Dynamic(){
		data=new int[5];
		nextIndex=0;
	}
	private void add(int element) {
		if(nextIndex==data.length)
			restructure();
		data[nextIndex]=element;
		nextIndex++;
	}
	protected void restructure() {
		int temp[]=data;
		data=new int[data.length+1];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	protected int size() {
		return nextIndex;
	}
	protected void set(int index,int element) {
		if(index>nextIndex)
			return;
		if(index<nextIndex)
			data[index]=element;
		else
			add(element);
	}
	protected int get(int index)
	{
		if(index>=nextIndex)
			return 0;
		return data[index];
	}
	private int removeLast() {
		if(size()==0)
			return -1;
		int value=data[nextIndex-1];
		nextIndex--;
		return value;
	}
	private boolean isEmpty() {
		if(size()==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamic d=new Dynamic();
		for(int i=0;i<100;i++) {
			d.add(i+10);
		}
		d.set(3, 4);
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println(d.size());
		}
	}

}
