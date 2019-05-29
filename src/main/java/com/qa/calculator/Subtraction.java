package com.qa.calculator;

public class Subtraction extends Calculator{
	public double subtract(double num1, double num2) {
				
		double answer = getNum1()-getNum2();
		System.out.println(answer);
		return answer;
	}

}
