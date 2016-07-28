package Task1;

public class Circle implements Shape 
{

	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		double pi = Math.PI;
		double area_Circle = (radius * radius) * pi;
		
		return area_Circle;
	}

	
	public double getPerimeter()
	{
		double pi = Math.PI;
		double circumference_Circle = 2 * radius * pi;
		return circumference_Circle;
	}


}
