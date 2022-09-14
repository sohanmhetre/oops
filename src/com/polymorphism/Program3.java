package com.polymorphism;

class Landline
{
	void calling ()
	{
		System.out.println("calling");
	}
}
class Mobile extends Landline
{
	void browsing()
	{
		System.out.println("browsing");
	}
	void playmusic()
	{
		System.out.println("play music");
	}
}

public class Program3 
{
 public static void main(String[] args) 
 {
	 Landline le=new Mobile();
	 le.calling();
//	 le.playmusic();
}
}
