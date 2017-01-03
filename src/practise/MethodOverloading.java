package practise;

public class MethodOverloading
{
	public void add(int var1,int var2)
	{
		System.out.println("Two Integer Addition Result:"+(var1+var2));
	}
	public void add(int var1,int var2,int var3)
	{
		System.out.println("Three Integer Addition Result:"+(var1+var2+var3));
	}
	public void add(double var1,double var2)
	{
		System.out.println("Two Double Values Addition Result:"+(var1+var2));
	}
   
	public static void main(String arg[])
	{
		MethodOverloading ob1=new MethodOverloading();
		ob1.add(10, 20);
		ob1.add(10,20,30);
		ob1.add(90.67, 89.79);
	}
}
