package com.qa.calculator;

public class Calculator {
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
	private float num1;
	private float num2;
	private String operator;
	
	
	public void calculate() {
		
		setOperator(Utilities.input("What operation would you like to do? +, -, * or /")) ; 
		
		if( Utilities.input("What operation would you like to do? +, -, * or /").equals("+")) {
			Addition.add();
		}
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}
