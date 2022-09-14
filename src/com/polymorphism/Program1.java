package com.polymorphism;
  
class Studentinclass
{
	void coding ()
	{
		System.out.println("larning coding");
		System.out.println("behave inocent");
	}
}
class Studentafterclass extends Studentinclass
{
	void attiyude ()
	{
		System.out.println("after larning get attitude ");
	}
}

public class Program1 
{
 public static void main(String[] args) 
{
	 Studentinclass ref =new Studentafterclass();
	 {
		ref. coding ();
//		ref. attiyude();
		}
}
}
//in upcasting sub class propertys hideen and only visebels super class propertiys