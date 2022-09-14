package com.polymorphism;

class Flightinair
{
	void wings()
	{
		System.out.println("fly using wings");
	}
}

class Flightinland extends Flightinair
{
	void wheels()
	{
		System.out.println("wheels in air");
	}
}

public class Program2 
{
	public static void main(String[] args) 
	{
		Flightinair fa = new Flightinland();
		fa.wings();
		//fa . wheels();
	}
	 
}
