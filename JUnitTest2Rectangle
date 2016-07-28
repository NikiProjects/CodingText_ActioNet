package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest2Rectangle {
	
	Rectangle rectangle_var2 = new Rectangle(500.5, 700.2);

	@Test
	public void testGetArea() 
	{
		double expectedArea_Rectangle = 500.5 * 700.2; 
		Double expectedArea_Rectangle_var2 = Double.valueOf(expectedArea_Rectangle);
		
		double actualArea_rectangle = rectangle_var2.getArea();
		Double actualArea_rectangle_var2 = Double.valueOf(actualArea_rectangle);
		
		String errorMessage_areaRect = "The value returned by the getArea method of class Rectangle does not match the expected value";
		
		assertEquals(errorMessage_areaRect, expectedArea_Rectangle_var2, actualArea_rectangle_var2);
		
		
	}

	@Test
	public void testGetPerimeter() 
	{
		
		double expectedPerimeter_Rectangle = (500.5 + 700.2) * 2;
		Double expectedPerimeter_Rectangle_var2 = Double.valueOf(expectedPerimeter_Rectangle);
		
		double actualPerimeter_rectangle = rectangle_var2.getPerimeter();
		Double actualPerimeter_rectangle_var2 = Double.valueOf(actualPerimeter_rectangle);
		
		String errorMessage_perimeterRect = "The value returned by the getPerimeter method of class Rectangle does not match the expected value";
		
// Scenerio of test failing. 		
//		Integer x = -1; 
//		assertEquals(errorMessage_perimeterRect, x, actualPerimeter_rectangle_var2);
		
		assertEquals(errorMessage_perimeterRect, expectedPerimeter_Rectangle_var2, actualPerimeter_rectangle_var2);
		
	
	
	}

}
