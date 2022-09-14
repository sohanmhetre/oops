package com.encapsulation.Class;
class OprationDetils
{
private String name;
private int noofpeople;
private float locatin;
public OprationDetils(String name,int noofpeople,float locatin)
{
	this.name=name;
	this.noofpeople=noofpeople;
	this.locatin=locatin;
}
public String getname()
{
	System.out.println("validte the access code ");
	return name;
}
public int getnoofpeople()
{
	System.out.println("validte the access code ");
	return noofpeople;
}
public float getlocatin()
{
	System.out.println("validte the access code ");
	return locatin;
}
public void setname(String na)
{
	System.out.println("validte the access code ");
	name=na;
}
public void setnoofpeople(int np)
{
	System.out.println("validte the access code ");
	noofpeople=np;
}
public void setlocatin(float lo)
{
	System.out.println("validte the access code ");
	locatin=lo;
}
}

public class MilitaryOperation 
{
 public static void main(String[] args) 
{
	 OprationDetils od = new OprationDetils("alph",34,6376476.766f);
	 System.out.println(od.getname());
	 System.out.println(od.getnoofpeople());
	 System.out.println(od.getlocatin());
	 od.setname("uri");
	 od.setnoofpeople(65);
	 od.setlocatin(87655.8766f);
	 System.out.println(od.getname());
	 System.out.println(od.getnoofpeople());
	 System.out.println(od.getlocatin());
}
}
