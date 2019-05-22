class polymor//polymorphism example showing 
{
	public void a(int a,int b)//method1 with 2 integer as argument
	{
		int c = a*b;
		System.out.println("this is method1 and output is product of numbers"+a+"and"+b+":"+"\n"+c);
	}
	public void a(double a,double b)//method 2 with 2 double values as argument
	{
		double d;
		d = a+b;
		System.out.println("this is method2 and output is sum of numbers"+a+"and"+b+":"+"\n"+d);
	}
	public void a(float a,float b,float c)//method 3 with 3 float values as the argument
	{
		float e;
		e = a*b*c;
		System.out.println("this is method3 and output is product of numbers"+a+","+b+","+c+":"+"\n"+e);
	}
	public static void main(String... args)//main method with string array as it can hold any type of data in the memory
	{
		polymor obj = new polymor();
		obj.a(10.0,20.0);
		obj.a(10,20,30);
		obj.a(20,30);
	}
}