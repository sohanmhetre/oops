package com.polymorphism.downcasting;
class Demo3
{
	void end ()
	{
		System.out.println("end methode ");
	}
}
class Demo4 extends Demo3 
{
	double b=4.5;
}
class Demo5 extends Demo4
{
	double r= 56.7;
	void run()
	{
		System.out.println("run methode "); 
	}
}
public class Sample2 
{
 public static void main(String[] args) 
{
//	Demo3 d3 = new Demo4 ();
//	d3.end();
//	Demo4 d4 = (Demo4)d3;
//	d4.end();
//	System.out.println(d4.b);
	
	Demo3 d3  = new Demo5 ();
	d3.end();
	Demo4 d4 = (Demo4)d3;
	System.out.println(d4.b);
	d4.end();
	Demo5 d5 = (Demo5)d4;
	d5.end();
	d5.run();
   System.out.println(d5.b);
   System.out.println(d5.r);
}
}
