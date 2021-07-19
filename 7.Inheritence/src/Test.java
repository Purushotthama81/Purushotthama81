
 class A {
	
	void m1()
	{
		System.out.println("method 1");
	}
	void m2()
	{
		System.out.println("method 2");
	}
	void m3()
	{
		System.out.println("override method");
	}
		
}
class B extends A{
	void m4()
	{
		System.out.println("method 4");
	}
	void m5()
	{
		System.out.println("method 5");
	}
	void m3()
	{
		System.out.println("overridden for A and override  B");
	}
		
	
	
}


class C extends B{
	void m6()
	{
		System.out.println("method 6");
	}
	void m7()
	{
		System.out.println("method 7");
	}
	void m3()
	{
		System.out.println("overridden method");
	}
		
	
	
}

class Test{

	public static void main(String[] args) {
		
		A a1=new A();
		a1.m1();
		a1.m2();
		a1.m3();
		
		B b1=new B();
		b1.m4();
		b1.m5();
		b1.m3();
		
		C c1=new C();
		c1.m6();
		c1.m7();
		c1.m3();
		
		A a=new B();
		a.m3();
		
		B b=new C();
		b.m3();
		

	}

}
