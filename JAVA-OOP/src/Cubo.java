
public class Cubo extends Rettangolo{
	
	public Cubo(int x, int y,int b) 
	{
		
		super(x,y,b,b);
	}
	
	public double area() 
	{
		return (super.area()*6);
	}
	

}
