package com.encapsulation.Class;
import com.encapsulation.program1.Bankdetails;
public class BankAccount 
{
 public static void main(String[] args) 
{
	 Bankdetails bs =new Bankdetails("sohan",77645364884l,6354,7865);
	System.out.println(bs.getaccNo());
	System.out.println(bs.getbankcode());
	System.out.println(bs.getname());
	System.out.println(bs.getpassword());
	bs.setcaptcha("87Wp56");
	System.out.println(bs.getcaptcha());
	System.out.println("show all details from this account ");
}
}