package oops;

public class Polynomial {
	Dynamic co;
	Polynomial(){
		co=new Dynamic();
	}
	private void setCoefficient(int degree,int coeff) {
			while(degree>this.co.nextIndex)
				this.co.nextIndex=degree;
				this.co.restructure();
			co.set(degree, coeff);
			/*if(degree>this.co.nextIndex)
				this.co.nextIndex=degree;*/
	}
	private void print()
	{
		//System.out.println(co.size());
		for(int i=0;i<co.size();i++) {
			if(co.get(i)!=0)
				System.out.print(co.get(i)+"x"+"^"+i+"+");
		}
		System.out.println();
	}
	private void add(Polynomial p) {
		
		int max=0;
		if(this.co.size()>p.co.size())
			max=this.co.size();
		else
			max=p.co.size();
		//System.out.println(max);
		for(int i=0;i<max;i++) 
		{
				//System.out.println("hi");
			    if(this.co.get(i)!=0|| p.co.get(i)!=0)
			   {
				this.setCoefficient(i,p.co.get(i)+this.co.get(i));
			   }
		}
		
	}
	private static Polynomial add(Polynomial p1,Polynomial p2) {
		Polynomial p3=new Polynomial();
		int max=0;
		if(p1.co.size()>p2.co.size())
			max=p1.co.size();
		else
			max=p2.co.size();
		//System.out.println(max);
		for(int i=0;i<max;i++) 
		{
				//System.out.println("hi");
			    if(p1.co.get(i)!=0|| p2.co.get(i)!=0)
			   {
			    	//System.out.println(p1.co.get(i));
			    	/*if(p1.co.get(i)==-1)
			    		p1.co.set(i,0);
			    	if(p2.co.get(i)==-1)
			    		p2.co.set(i,0);*/
				p3.setCoefficient(i,p2.co.get(i)+p1.co.get(i));
			   }
		}
		return p3;
	}
	private void multiply(Polynomial p) {
		Polynomial k=new Polynomial();
		int max=Math.max(this.co.size(), p.co.size());
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<max;j++) {
				//System.out.println("hi"+max);
				//System.out.println(this.co.get(i)+"*"+p.co.get(j));
			/*	if(k.co.get(i+j)<0)
				{
				    k.co.set(i+j, 0);
				}*/
				//System.out.println(k.co.data[0]);
				//System.out.println(k.co.get(i+j));
					k.setCoefficient(i+j, k.co.get(i+j)+this.co.get(i)*p.co.get(j));
			}
		}
		this.co.nextIndex=k.co.size();
		this.co.data=k.co.data;
	}
	private int evaluate(int k) {
		int sum=0;
		for(int i=0;i<this.co.size();i++) {
			sum+=this.co.get(i)*Math.pow(k, i);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1=new Polynomial();
		p1.setCoefficient(0,3);
		p1.setCoefficient(2,2);
		p1.print();
		
		Polynomial p2=new Polynomial();
		p2.setCoefficient(0,3);
		p2.setCoefficient(2,2);
		p2.setCoefficient(1,4);
		p2.setCoefficient(2,5);
		p2.print();
		
		p1.add(p2);
		p1.print();
		p2.print();
		
		p2.multiply(p1);
		p2.print();
		p1.print();
		
		Polynomial p3=Polynomial.add(p1,p2);
		p3.print();
		p2.print();
		p1.print();
		
		int ans=p2.evaluate(10);
		System.out.println(ans);
	}

}
