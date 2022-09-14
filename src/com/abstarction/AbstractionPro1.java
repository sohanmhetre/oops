package com.abstarction;

interface OnlineShoping
{
	void orderproduct ();
	void paymentorder();
	void deliveryproduct();
	void deliverdproduct();
}

class Flipkart implements OnlineShoping
{
	public void orderproduct()
	{
		System.out.println("search the product");
        System.out.println("see the offers and sellect the product");
        System.out.println("write the basic deails and address");
        System.out.println("orderd the product from flipkart");
	}
	
	 public void paymentorder()
	 {
		 System.out.println("select discount offer ");
		 System.out.println("select payment methode ");
		 System.out.println("done the pyment of order the product from flipkart"); 
	 }
	 
	 public void deliveryproduct()
	 {
		 System.out.println("pckging the orderd product ");
		 System.out.println("diliver the product");
	 }
	 
	 public void deliverdproduct ()
	 {
	 System.out.println("search the address ");
	 System.out.println("check the basic deails ");
	 System.out.println("deliverd the product from flipkart");
}
}
class Meesho implements OnlineShoping
{
	public void orderproduct()
	{
		System.out.println("search the product");
        System.out.println("orderd the product from meesho");
        System.out.println("write the basic deails and address");
	}
	
	 public void paymentorder()
	 {
		 System.out.println("select payment methode ");
		 System.out.println("done the pyment of order the product from meesho");
	 }
	 
	 public void deliveryproduct()
	 {
		 System.out.println("pckging the orderd product ");
		 System.out.println("diliver the product");
	 }
	 
	 public void deliverdproduct ()
	 {
	 System.out.println("search the address ");
	 System.out.println("check the basic deails ");
	 System.out.println("deliverd the product from meesho");
}
}
class Playstore
{
	public OnlineShoping download (char select)
	{
 	if(select == 'f')
 	{
 		return new Flipkart();
 	}
 	else
 	{
 		return new Meesho();
 	}
	}
}
public class AbstractionPro1 
{
 public static void main(String[] args) 
 {
	 Playstore ref =new Playstore();
	 OnlineShoping os = ref .download('f');
	 os.orderproduct();
	 os.paymentorder();
	 os.deliveryproduct();
	 os.deliverdproduct();
     
}
}
