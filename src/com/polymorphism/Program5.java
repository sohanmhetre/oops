
    //     upcasting //

package com.polymorphism;

class DebitCard
{
	long number=7654566764l;
	void swipe ()
	{
		System.out.println("swipe totransact");
	}
}
class  Bank
{
	void atm(DebitCard ref)
	{
		System.out.println("display account number");
		ref.swipe();
	}
}
public class Program5 
{
  public static void main(String[] args) 
 {
	Bank b1= new Bank();
	b1.atm(new DebitCard());
}
}
