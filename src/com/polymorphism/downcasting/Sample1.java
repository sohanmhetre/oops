package com.polymorphism.downcasting;
class Demo1
{
	int a=90;
}
class Demo2 extends  Demo1
{
	void test()
	{
		System.out.println("test methode..");
	}
}
public class Sample1 
{
 public static void main(String[] args) 
 {
	Demo1 d1 = new Demo2();
	System.out.println(d1.a); 
	Demo2 d2=(Demo2)d1;
	System.out.println(d2.a);
	d2.test();
}
}

