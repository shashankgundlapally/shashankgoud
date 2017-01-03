package practise;

import java.util.*;
class mybankexception extends Exception{
	public mybankexception(){
		super("amunt not sufficiemt");
	}
}
public class mybank
{
   public void draw(int val) throws mybankexception
   {
    int am = 1000;
     if((am-val)<500)
     {
       throw new mybankexception();
     }
    else
  {
     System.out.println("success");
  }
}
   public static void main(String args[])
   {
      mybank obj = new mybank();
        int amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
       amt = sc.nextInt();
    try{
             obj.draw(amt);
    }

   catch(mybankexception e)
       {
            System.out.println(e);
      }
}
}
