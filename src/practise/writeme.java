package practise;

import java.io.*;
class writeme
{
   public static void main(String args[])
   {
    try{
           FileOutputStream fos = new FileOutputStream("data.txt");
      String str = "hello ";
      for(int i=0;i<str.length();i++)
      {
         fos.write(str.charAt(i));
       }
   System.out.println("My Name is shashank goud....");
   fos.close();
  }
  catch(Exception e)
 { 
    System.out.println(e);
  }

}
}
