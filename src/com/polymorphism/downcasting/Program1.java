package com.polymorphism.downcasting;

class Traveller
{
	void bike()
	{
		System.out.println("traveled by bike to a places near by me");
	}
}

class TravelInVillage extends Traveller
{
	void bike ()
	{
		System.out.println("required less fluid ");
	}
}
class TravelInTahsil extends Traveller
{
	void bike()
	{
		System.out.println("required more fluid but its lower cost");
	}
}

class TravelInDistrict extends Traveller
{
	void bike ()
	{
		System.out.println("required maximum fluid but its more cost");
	}
}
 
class PlacesVisited 
{
	void traveled (Traveller ref)
	{
		ref. bike();
	}
}
public class Program1 
{
 public static void main(String[] args) 
{
	 PlacesVisited pv = new PlacesVisited ();
	 pv.traveled(new TravelInVillage());
	 pv.traveled(new TravelInTahsil());
	 pv.traveled(new TravelInDistrict());
}
}
