package com.amdocs;

import java.util.Stack;

public class RPNCalculator {
	private double firstOperand, secondOperand;
	private double result = 0.0;
	Stack<Double> stack = new Stack<Double>();

	public double solve(String postfixExpression) {

		OperatorFactory operatorFactory = new OperatorFactory();

		String[] elements = postfixExpression.split(" ");
		for (int j = 0; j < elements.length; j++) {
			String token = elements[j];
			if (!"+".equals(token) && !"*".equals(token) && !"-".equals(token) && !"/".equals(token)) {
				stack.push(Double.parseDouble(token));
			}

			else {
				String Operator = elements[j];
				firstOperand = stack.pop();
				secondOperand = stack.pop();
				if (Operator.equals("/")) {
					Operator division = operatorFactory.getOperator("/");
					result = division.calculate(secondOperand, firstOperand);
				} else if (Operator.equals("*")) {
					Operator multiply = operatorFactory.getOperator("*");
					result = multiply.calculate(firstOperand, secondOperand);

				} else if (Operator.equals("+")) {
					Operator add = operatorFactory.getOperator("+");
					result = add.calculate(firstOperand, secondOperand);
				} else if (Operator.equals("-")) {
					Operator subtraction = operatorFactory.getOperator("-");
					result = subtraction.calculate(secondOperand, firstOperand);
				}
				stack.push(result);

			}

		}
		return stack.pop();

	}
}
