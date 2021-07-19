
public class Test1 {

	 int a=2;
	int b=4;
	
	static int c=1;
	static int d=2;
	
	void m1() {
		System.out.println(Test1.c);
		System.out.println(Test1.d);
		
		Test1.m3();
		Test1.m4();
		
	}
	
	void m2()
	{
		System.out.println(Test1.c);
		System.out.println(Test1.d);
		
		Test1.m3();
		Test1.m4();
		
	}
	
	
	
	static void m3() {
		Test1 t=new Test1();
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.m1();
		t.m2();
	}
	
	static void m4() {
		Test1 t=new Test1();
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.m1();
		t.m2();
		
	}
	
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.a);
		System.out.println(t.b);
		
		System.out.println(Test1.c);
		System.out.println(Test1.d);
		
		t.m1();
		t.m2();
		
		Test1.m3();
		Test1.m4();

	}

}
