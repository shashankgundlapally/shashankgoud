package practise;

import java.io.*;
class readme
{
 public static void main(String args[])
  {
     try{
    FileInputStream fis = new FileInputStream("data.txt");
    int avl = fis.available();
    System.out.println("no of bytes" +avl);
       byte buff[] = new byte[avl];
    // read() method is reading the data from the file and storing into the byte array.
    // it reads from oth location until tge no of bytes in the file.
        fis.read(buff,0,avl);
      String str = new String(buff);
      System.out.println("the content of file"+str);
     fis.close();
}
    catch(Exception e)
   {
     System.out.println("exception arised"+e);
   }
}
}