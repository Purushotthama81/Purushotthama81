package com.dss;

public class Test1 {
	String m1(String a) 
	{
		System.out.println("method 1");
		return a;
		
	}
	
	int m1(int a,int b) 
	{
		System.out.println("method 2");
		return a+b;
		
	}

	public static void main(String[] args) {

		Test1 t=new Test1();
		t.m1("purush");
		t.m1(2,3);

	}

}