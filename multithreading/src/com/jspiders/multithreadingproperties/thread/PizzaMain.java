package com.jspiders.multithreadingproperties.thread;

public class PizzaMain 
{
   public static void main (String[]args)
   {
	    Pizza pizza=new Pizza();
	    Friends frd=new Friends(pizza);
	    Dominos domi=new Dominos(pizza);
	    
	    domi.start();

	    frd.start();
	    
	    
   }
}
