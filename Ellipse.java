package task1;

import java.util.Scanner;

public class Ellipse 
{
	
	private double minorRadius;
	private double majorRadius;
	

	
	
	public Ellipse(double minorRadius, double majorRadius)
	{
		this.minorRadius = minorRadius;
		this.majorRadius = majorRadius;
	}


	public double getArea()
	{
		double pi = Math.PI;
		double ellipse_Area = pi * minorRadius * majorRadius;
		// line below for test fail	
		// double ellipse_Area = pi * minorRadius * majorRadius * 2;
		
		return ellipse_Area;
		
	}
	
	public double getPerimeter()
	{
		double calculation1 = (minorRadius + majorRadius) * 3.0;
		double calculation2 = (3.0 * minorRadius) + majorRadius;
		double calculation3 = (3.0 * majorRadius) + minorRadius;
		double calculation4 = calculation2 * calculation3;
		double calculation5 = Math.sqrt(calculation4);
		double calculation6 = calculation1 - calculation5;
		double calculation7 = Math.PI * calculation6;
		// line below for test fail	
		// double calculation7 = Math.PI * calculation6 * 2;
			return calculation7;
	
	}
	





}
