package me.solyagergo.calculator;

public class Calculator {
	
	public double addition(double operandOne, double operandTwo) {
		return operandOne + operandTwo;
	}
	
	public double subtraction(double operandOne, double operandTwo) {
		return operandOne + operandTwo;
	}
	
	public double multiplication(double operandOne, double operandTwo) {
		return operandOne * operandTwo;
	}
	
	public double division(double operandOne, double operandTwo) {
		//If you divide by zero with a double the result will be Infinity, therefore we need to check for the exception manually.
		if (operandTwo == 0) throw new ArithmeticException("Can't divide by zero");
		return operandOne / operandTwo;
	}

}
