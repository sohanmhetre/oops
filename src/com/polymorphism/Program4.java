                   // upcasting //

package com.polymorphism;

class Example1
{
	float e= 4.5f;
}
class Example2 extends Example1
{
	void task ()
	{
		System.out.println("task methode ");
	}
}
class Example3 extends Example2
{
	String name1="hallo";
	void disp()
	{
		System.out.println("disp method");
	}
}

public class Program4 
{
 public static void main(String[] args) 
{
	 Example3 e3 = new Example3();
	 e3.task();
	 System.out.println(e3.e);
	 e3.disp();

	 Example2 e2 =e3;
	 e2.task();
	 System.out.println(e2.e);
	 //e2.disp();
	// System.out.println(e2.name);
	 
	 Example1 e1=e2;
	 System.out.println(e1.e);
	 //e1.disp();
	// System.out.println(e1.name);
	// e1.task(); 
	//e1.disp();
	 
}
}
