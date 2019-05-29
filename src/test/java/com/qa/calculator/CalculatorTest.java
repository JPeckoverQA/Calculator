package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addition() {
		Calculator calc = new Calculator();
		float actualValue = calc.add(2, 2);
		Assert.assertEquals("addition error", 4, actualValue);
	}
	
	@Test
	public void subtraction() {
		Calculator calc = new Calculator();
		float actualValue = calc.subtract(5, 2);
		Assert.assertEquals("subtraction error", 3, actualValue);
	}
	
	@Test
	public void multiplication() {
		Calculator calc = new Calculator();
		float actualValue = calc.multiply(5, 2);
		Assert.assertEquals("multiplication error", 10, actualValue);
	}
	
	@Test
	public void division() {
		Calculator calc = new Calculator();
		float actualValue = calc.divide(10, 2);
		Assert.assertEquals("division error", 5, actualValue);
	}
	
}
