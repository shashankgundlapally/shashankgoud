package practise;

class BoxOverload 
{
    double width,height,depth;
    
    public BoxOverload() //default Constructor
    {
    	width=10;
    	height=15;
        depth=20;
    }
    
    public BoxOverload(double val) //overloaded Constructor
   {
    width=height=depth=(val>0)?val:1;	
    }
    public double volume()
    {
    	return width*height*depth;
    }
    
     public static void main(String arg[])
     {
    	 BoxOverload obj1=new BoxOverload();
    	 BoxOverload obj2=new BoxOverload(10);
    	
    	 
    	System.out.println("Default Box Volume:"+obj1.volume());
    	System.out.println("square Box Volume:"+obj2.volume());
     }
}
