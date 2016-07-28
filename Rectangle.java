package Task1;

public class Rectangle implements Shape
{
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		double area = width * height;
		return area;
	}

	
	public double getPerimeter()
	{
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	

}
