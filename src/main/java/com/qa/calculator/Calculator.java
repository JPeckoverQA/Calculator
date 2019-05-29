package com.qa.calculator;

public class Calculator {
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
	private float num1;
	private float num2;
	
	
	
	public void calculate() {
		if( Utilities.input("What operation would you like to do? +, -, * or /").equals("+")) {
			Addition.add();
		}
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
}
