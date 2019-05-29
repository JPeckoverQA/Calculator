package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addition() {
		Calculator calc = new Calculator();
		Addition add = new Addition();
		double actualValue = calc.add(2.0, 2.0);
		Assert.assertEquals("addition error", 4.0, actualValue);
	}
	
	@Test
	public void subtraction() {
		Calculator calc = new Calculator();
		Subtraction subtract = new Subtraction();
		double actualValue = calc.subtract(5.0, 2.0);
		Assert.assertEquals("subtraction error", 3, actualValue);
	}
	
	@Test
	public void multiplication() {
		Calculator calc = new Calculator();
		Multiplication multiply = new multiplication();
		double actualValue = calc.multiply(5.0, 2.0);
		Assert.assertEquals("multiplication error", 10, actualValue);
	}
	
	@Test
	public void division() {
		Calculator calc = new Calculator();
		Division divide = new Division();
		double actualValue = calc.divide(10.0, 2.0);
		Assert.assertEquals("division error", 5, actualValue);
	}
	
}
