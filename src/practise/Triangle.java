package practise;

public class Triangle
{
	///properties
	private double base,height;
	
	//Getter and Setter Methods
	public double getBase(){
		return base;
	}
	
	public void setBase(double base) {
		this.base=(base>0)?base:1;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=(height>0)?height:1;
	}
	
	//Object Manipulation Methods
    public double area()
    {
    	return base*height*0.5;
	}

}
