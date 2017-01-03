package practise;

import java.util.*;

public class scanner
{
    public static void main(String arg[])
    {
        String input = "10 tea 20 coffee 30 tea";
        Scanner s = new Scanner(input).useDelimiter("\\s");
       System.out.println(s.nextInt());
       System.out.println(s.next());
System.out.println(s.nextInt());
       System.out.println(s.next());
     s.close();
      }
}
