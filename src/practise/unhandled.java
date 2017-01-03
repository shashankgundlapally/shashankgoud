package practise;

import java.util.*;
class unhandled 
{
   public static void main(String[] args)
{
      int n1,n2,n3;
      float result,result1;
    Scanner sc = new Scanner(System.in);
     System.out.println("ENter the first number");
     n1 = sc.nextInt();
      System.out.println("ENter the second number");
     n2 = sc.nextInt();
System.out.println("ENter the third number");
     n3 = sc.nextInt();
    try{
     result = n1/n2;
     try{
             result1 = n1/n3;
             System.out.println(result1);

         }
       catch(Exception e){
              System.out.println("ravi");
        }
System.out.println(result);

     }
    catch(Exception e){
         System.out.println("Shashank goud");
sc.close();
}
}
}

