package task1;

public class Square 
{

	private double width_sqr;
	private double height_sqr;
	
	
	public Square(double width_sqr, double height_sqr)
	{
		this.width_sqr = width_sqr;
		this.height_sqr = height_sqr;
	}
	
	public double getArea()
	{
		double areaSquare = width_sqr * height_sqr;
		// line below for test fail	
		// double areaSquare = width_sqr * height_sqr * 2;
		
		return areaSquare;
	}
	
	public double getPerimeter()
	{
		double perimeterSquare = (width_sqr + height_sqr) * 2;
		// line below for test fail	
		// double perimeterSquare = (width_sqr + height_sqr) * 2 * 2;
		return perimeterSquare;
	}





}
