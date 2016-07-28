package Task1;

public class TestShapeValues {

	public static void main(String[] args) 
	{
		
		Circle circle = new Circle(2.5);
		double calculatedCircleArea = circle.getArea();
		double calculatedCircleCircumference = circle.getPerimeter();
		System.out.println("The area of the circle is: " + calculatedCircleArea);
		System.out.println("The circumference of the circle is: " + calculatedCircleCircumference);
		
		Rectangle rectangle = new Rectangle(4.5, 6.0);
		double calculatedRectangleArea = rectangle.getArea();
		double calculatedRectanglePerimeter = rectangle.getPerimeter();
		System.out.println("The area of the rectangle is: " + calculatedRectangleArea);
		System.out.println("The perimeter of the rectangle is: " + calculatedRectanglePerimeter);
		
		Triangle triangle = new Triangle(3.0, 2.8, 5.5);
		double calculatedTriangleArea = triangle.getArea();
		double calculatedTrianglePerimeter = triangle.getPerimeter();
		System.out.println("The area of the triangle is: " + calculatedTriangleArea);
		System.out.println("The perimeter of the rectangle is: " + calculatedTrianglePerimeter);
	
	
	
	}

}
