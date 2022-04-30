package oops;

public class Fraction {
	private int numerator;
	private int denominator;
	Fraction(int n,int d){
		this.numerator=n;
		if(d==0)
			return;
		this.denominator=d;
	}
	private void print() {
		simplify();
		if(denominator==1)
			System.out.println(numerator);
		else
			System.out.println(numerator+"/"+denominator);
	}
	private void simplify() {
		int gcd=1,min=Integer.MIN_VALUE;
		min=Math.min(numerator, denominator);
		for(int i=1;i<=min;i++) {
			if(numerator%i==0 && denominator%i==0)
				gcd=i;
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	private void setNumerator(int n) {
		this.numerator=n;
		simplify();
	}
	private void setDenominator(int d) {
		if(d==0)
			return;
		this.denominator=d;
		simplify();
	}
	private int getNumerator() {
		return numerator;
	}
	private int getDenominator() {
		return denominator;
	}
	private void add(Fraction f) {
		this.numerator=this.numerator*f.denominator+this.denominator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		simplify();
	}
	private void multiply(Fraction f) {
		this.numerator=this.numerator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		simplify();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1=new Fraction(20,30);
		f1.print();
		f1.setNumerator(12);
		int d=f1.getDenominator();
		System.out.println(d);
		f1.print();
		f1.setNumerator(10);
		f1.setDenominator(30);
		f1.print();
		Fraction f2=new Fraction(3,4);
		f1.add(f2);
		f1.print();
		f2.print();
		Fraction f3=new Fraction(3,5);
		f2.multiply(f3);
		f2.print();
		f3.print();
		
	}

}
