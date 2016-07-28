package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest4Ellipse {

Ellipse ellipse = new Ellipse(67.0, 55.0);


	
	@Test
	public void testGetArea() 
	{
		
		
		
		double expectedArea_Ellipse = Math.PI * 67.0 * 55.0; 
		Double expectedArea_Ellipse_var2 = Double.valueOf(expectedArea_Ellipse);
		
		double actualArea_Ellipse = ellipse.getArea();
		Double actualArea_Ellipse_var2 = Double.valueOf(actualArea_Ellipse);
		
		
		assertEquals(expectedArea_Ellipse_var2, actualArea_Ellipse_var2);
	}

	@Test
	public void testGetPerimeter() 
	{
		
 
		 	double calculation1 = (67.0 + 55.0) * 3.0;
			double calculation2 = (3.0 * 67.0) + 55.0;
			double calculation3 = (3.0 * 55.0) + 67.0;
			double calculation4 = calculation2 * calculation3;
			double calculation5 = Math.sqrt(calculation4);
			double calculation6 = calculation1 - calculation5;
			double calculation7 = Math.PI * calculation6;
		
		 
		 
		 
		 
		 double expectedPerimeter_Ellipse = calculation7 ; 
		Double expectedPerimeter_Ellipse_var2 = Double.valueOf(expectedPerimeter_Ellipse);
		
		double actualPerimeter_Ellipse = ellipse.getPerimeter();
		Double actualPerimeter_Ellipse_var2 = Double.valueOf(actualPerimeter_Ellipse);
		
		
		assertEquals(expectedPerimeter_Ellipse_var2, actualPerimeter_Ellipse_var2);
	
	}

}
