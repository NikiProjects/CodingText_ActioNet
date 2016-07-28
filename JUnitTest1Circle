package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest1Circle {

	Circle circle_var2 = new Circle(7.5);
	
	@Test
	public void testGetArea() 
	{
		
		
		double expectedValue = Math.PI * 7.5 * 7.5;
		Double expectedValue_var2 = Double.valueOf(expectedValue);
		
		double area_circle = circle_var2.getArea();
		Double value2 = Double.valueOf(area_circle);
		assertEquals(expectedValue_var2, value2);
		
		
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPerimeter() {
		
		double expectedValue_perimeter = 2 * 7.5 * Math.PI;
		Double expectedValue_perimeter_var2 = Double.valueOf(expectedValue_perimeter);
		
		
		double actualValue_perimeter = circle_var2.getPerimeter();
		Double actualValue_perimeter_var2 = Double.valueOf(actualValue_perimeter);
		
		assertEquals(expectedValue_perimeter_var2, actualValue_perimeter_var2);
		
		//fail("Not yet implemented");
	}

}
