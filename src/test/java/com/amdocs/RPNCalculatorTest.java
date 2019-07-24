package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {

	@Test
	public void addition() {
		RPNCalculator calculator = new RPNCalculator();
		double expected = 14;
		double actual = calculator.solve("6 8 +");
		assertEquals(expected, actual, .0001);

		expected = 11;
		actual = calculator.solve("7 4 +");
		assertEquals(expected, actual, 0.0001);

	}

	@Test
	public void subtraction() {
		RPNCalculator calculator = new RPNCalculator();
		double expected = 3;
		double actual = calculator.solve("9 6 -");
		assertEquals(expected, actual, .0001);

		expected = -38;
		actual = calculator.solve("7 45 -");
		assertEquals(expected, actual, 0.0001);

	}

	@Test
	public void division() {
		RPNCalculator calculator = new RPNCalculator();
		double expected = 1.1;
		double actual = calculator.solve("8 6 /");
		assertEquals(expected, actual, .5);

		expected = 4;
		actual = calculator.solve("12 3 /");
		assertEquals(expected, actual, 0.2);

	}

	@Test
	public void multiplication() {
		RPNCalculator calculator = new RPNCalculator();
		double expected = 26;
		double actual = calculator.solve("13 2 *");
		assertEquals(expected, actual, .0001);

		expected = 28;
		actual = calculator.solve("7 4 *");
		assertEquals(expected, actual, 0.0001);

	}

	@Test
	public void expression() {
		RPNCalculator calculator = new RPNCalculator();
		double expected = 0.0;
		double actual = calculator.solve("3 2 + 9 6 - 14 7 / + -");
		assertEquals(expected, actual, .0001);
	}
	
	
	
	
	
	
}
