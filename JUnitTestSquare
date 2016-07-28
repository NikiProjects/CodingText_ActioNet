package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest5Square {

	Square square = new Square(432.8, 717.2);
	
	@Test
	public void testGetArea() 
	{
		double expectedArea_Square = 432.8 * 717.2; 
		Double expectedArea_Square_var2 = Double.valueOf(expectedArea_Square);
		
		double actualArea_square = square.getArea();
		Double actualArea_square_var2 = Double.valueOf(actualArea_square);
		
		String errorMessage_areaSquare = "The value returned by the getArea method of class Square does not match the expected value";
		
		assertEquals(errorMessage_areaSquare, expectedArea_Square_var2, actualArea_square_var2);
	}

	@Test
	public void testGetPerimeter() 
	{
		double expectedPerimeter_Square = (432.8 + 717.2) * 2;
		Double expectedPerimeter_Square_var2 = Double.valueOf(expectedPerimeter_Square);
		
		double actualPerimeter_square = square.getPerimeter();
		Double actualPerimeter_square_var2 = Double.valueOf(actualPerimeter_square);
		
		String errorMessage_perimeterSquare = "The value returned by the getPerimeter method of class Square does not match the expected value";
		
// Scenerio of test failing. 		
//		Integer x = -1; 
//		assertEquals(errorMessage_perimeterSquare, x, actualPerimeter_square_var2);
		
		assertEquals(errorMessage_perimeterSquare, expectedPerimeter_Square_var2, actualPerimeter_square_var2);
	}

}
