// modified for JUnit Test

package task1;

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
		
		// line below for test fail	
		// double area_Circle = (radius * radius) * pi * 2;
		return area_Circle;
	}

	
	public double getPerimeter()
	{
		double pi = Math.PI;
		double circumference_Circle = 2 * radius * pi;
		
// line below for test fail		
// double circumference_Circle = 2 * radius * pi * 2;		
		
		return circumference_Circle;
	}


}
