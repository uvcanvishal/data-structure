package oops;

public class Complex {
	private int real;
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	private int imaginary;
	Complex(int r,int i){
		this.real=r;
		this.imaginary=i;
	}
	private void print()
	{
		System.out.println(this.real+" "+"+"+" "+this.imaginary+"i");
	}
	private void add(Complex c) {
		this.real=this.real+c.real;
		this.imaginary=this.imaginary+c.imaginary;
	}
	private void multiply(Complex c) {
		int k=real,j=imaginary;
		this.real=k*c.real-j*c.imaginary;
		this.imaginary=k*c.imaginary+j*c.real;
	}
	private static Complex add(Complex c,Complex k) {
		int real=c.real+k.real;
		int imaginary=c.imaginary+k.imaginary;
		Complex a=new Complex(real,imaginary);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(2,3);
		c1.print();
		
		Complex c2=new Complex(1,5);
		c1.add(c2);
		c1.print();
		c2.print();
		
		Complex c3=new Complex(2,3);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
		Complex c4=new Complex(1,5);
		Complex c5=add(c2,c4);
		c5.print();
		c2.print();
		c4.print();
		
		
	}

}
