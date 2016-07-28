package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest3Triangle {
	
	Triangle triangle_var2 = new Triangle(235.0, 445.0, 60.0);

	@Test
	public void testGetArea() 
	{
		double expectedArea_Triangle = (235.0 * 445.0) / 2; 
		Double expectedArea_Triangle_var2 = Double.valueOf(expectedArea_Triangle);
		
		double actualArea_Triangle = triangle_var2.getArea();
		Double actualArea_Triangle_var2 = Double.valueOf(actualArea_Triangle);
		
		String errorMessage_areaTriangle = "Boolean expression in method assertTrue is false";
		assertTrue(errorMessage_areaTriangle, expectedArea_Triangle_var2.equals(actualArea_Triangle_var2)); 
		
	}

	@Test
	public void testGetPerimeter() 
	{
		
		double expectedPerimeter_Triangle = 235.0 + 445.0 + 60.0;
		Double expectedPerimeter_Triangle_var2 = Double.valueOf(expectedPerimeter_Triangle);
		
		double actualPerimeter_Triangle = triangle_var2.getPerimeter();
		Double actualPerimeter_Triangle_var2 = Double.valueOf(actualPerimeter_Triangle);
		
		String errorMessage_perimeterTriangle = "Boolean expression in method assertTrue is false";
		

		
		assertTrue(errorMessage_perimeterTriangle, expectedPerimeter_Triangle_var2.equals(actualPerimeter_Triangle_var2));
	
	
	}

}
