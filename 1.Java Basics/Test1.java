class Test1
{
	int a=2;
	int b=3;
	int m1(int a,int b)
	{
		int c=a+b;
		return c;
	}
			
	
	public static void main(String[] args) 
	{
		Test1 t=new Test1();
        System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.m1(5,6));
		

	}

}