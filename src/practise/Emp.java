package practise;

class inheritdemo
{
	String empid,empname;
}
class AdminEmp extends inheritdemo
{
	int incentive;
	private String empIncentive;
	public AdminEmp()
	{
empid="E1001";
empname="Harish";
incentive=9000;
	}
	public void display()
	{
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee Incentive:"+empIncentive);
	}
}
public class Emp

{
	public static void main(String args[])
	{
		AdminEmp obj=new AdminEmp();
		obj.display();
	}
}
