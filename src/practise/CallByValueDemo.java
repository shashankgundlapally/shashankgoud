package practise;

public class CallByValueDemo

{
public void swap(int var1,int var2)
{
	int temp;
	temp=var1;
	var1=var2;
	var2=temp;
	
	System.out.println("First Variable Value :"+var1);
	System.out.println("Second Variable Value :"+var2);
}
public static void main(String arg[])
{
	CallByValueDemo obj=new CallByValueDemo();
	int  num1=10,num2=20;
	obj.swap(num1, num2);
	System.out.println("First Variable  in Main :"+num1);
	System.out.println("Second Variable  in Main :"+num2);
	
}
}
