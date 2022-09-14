package com.encapsulation.program1;
public class Bankdetails 
{
 private String name;
 private long accNo;
 private int bankcode;
 private int password;
 private String captcha;
 public Bankdetails(String name,long accNo, int bankcode, int password)
 {
	 this.name=name;
	 this.accNo=accNo;
	 this.bankcode=bankcode;
	 this.password=password;
	 this.captcha=captcha;
 }
 public long getaccNo()
 {
	 System.out.println("virifay accNo");
	 return accNo;
 }
 public int getbankcode()
 {
	 System.out.println("virifay bankcode");
	 return bankcode;
 }
 public String getname()
 {
	 System.out.println("virifay name");
	 return name;
 }
 public int getpassword()
 {
	 System.out.println("write valid password");
	 return password;
 }
 public String getcaptcha()
 {
	 System.out.println("write valid captcha");
	 return captcha;
 }
 public void setcaptcha(String ca)
 {
	 System.out.println("show captcha");
	 captcha = ca;
 }
}
