package practise;
import java.io.*;
class readdemo
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
   System.out.println("written");
   fos.close();
  }
  catch(Exception e)
 { 
    System.out.println(e);
  }

}
}