package com.dss;


public class Test {
	int m1(int a) 
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

		Test t=new Test();
		t.m1(1);
		t.m1(2,3);

	}

}
