package com.dss;

public class Test2 {
	String m1(String a) 
	{
		System.out.println("method 1");
		return a;
		
	}
	
	int m1(int a) 
	{
		System.out.println("method 2");
		return a;
		
	}

	public static void main(String[] args) {

		Test2 t=new Test2();
		t.m1("purush");
		t.m1(2);

	}

}