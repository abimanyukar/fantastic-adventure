package javaoops;

public class Oops1 {

	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	public int square(int a,int b) {
		return a*b;
	}
	public int square(int a)
	{
		return a*a;
	}
	public String sum1(int a,int b) {
		b=a+b;
		return Integer.toString(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10,c=12;
		Oops1 o1=new Oops1();
		System.out.println(o1.sum(a,b));
		System.out.println(o1.sum(a,b,c));
		System.out.println(o1.square(a,b));
		System.out.println(o1.square(a));
		System.out.println(o1.sum1(a, b));		
	}

}
